package defpackage;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.EOFException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class z24 implements vd4, co7, ml4, r9, wh5, y60, x74, kt8, yt7, u30, b79, s58, ir9, eob, o7, ll5 {
    public final byte a;
    public Object b;

    public z24(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.b = mm5.p();
                return;
        }
    }

    public static boolean U(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String e0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public final void A2(long j, int i, long j2) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new l30(tg2Var, i, j, j2, (byte) 0));
        }
    }

    @Override
    public final void B1(int i, long j) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar != null && (arrayList = f4bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((f4b) zi8Var.d.T.get(i)).X = j;
        }
    }

    @Override
    public final void D(pd5 pd5Var) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 0));
        }
    }

    @Override
    public final void D2(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z24.D2(java.lang.Object):void");
    }

    @Override
    public final void E1() {
        ((fk6) this.b).l1 = true;
    }

    @Override
    public final void F(float f, int i) {
        ((x46) this.b).h(f);
    }

    @Override
    public final Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public final Integer H(String str) {
        String R = R(str);
        if (!TextUtils.isEmpty(R)) {
            try {
                return Integer.valueOf(Integer.parseInt(R));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + e0(str) + "(" + R + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public final void H1(long j) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.D = j;
        f4bVar.j = true;
        zi8Var.w(true);
    }

    public final JSONArray I(String str) {
        String R = R(str);
        if (!TextUtils.isEmpty(R)) {
            try {
                return new JSONArray(R);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + e0(str) + ": " + R + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final String J(Resources resources, String str, String str2) {
        String[] strArr;
        String R = R(str2);
        if (!TextUtils.isEmpty(R)) {
            return R;
        }
        String R2 = R(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(R2)) {
            return null;
        }
        int identifier = resources.getIdentifier(R2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", e0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray I = I(str2.concat("_loc_args"));
        if (I == null) {
            strArr = null;
        } else {
            int length = I.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = I.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + e0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override
    public final void K() {
        zi8 zi8Var = (zi8) this.b;
        zi8Var.s(null, null, true);
        t7b t7bVar = ((i7b) zi8Var).D0;
        i7b i7bVar = t7bVar.Y0;
        if (i7bVar != null) {
            i7bVar.s(null, null, true);
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            x6bVar.n0();
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null) {
            j7bVar.setHasRoundVideo(false);
        }
        f4b f4bVar = t7bVar.L1;
        if (f4bVar != null) {
            File file = f4bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                f4bVar = t7bVar.L1;
                f4bVar.o0 = null;
            }
            if (f4bVar.p0 != null) {
                try {
                    new File(t7bVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                t7bVar.L1.p0 = null;
            }
        }
    }

    @Override
    public final void L() {
        ((fk6) this.b).n1 = true;
    }

    @Override
    public final void L0(long j) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.r0 = j;
        f4bVar.j = true;
        zi8Var.y(true);
    }

    @Override
    public final void M(boolean z, float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar != null) {
            f4bVar.Z = f;
            f4bVar.j = true;
            lbc lbcVar = zi8Var.e;
            if (lbcVar != null && lbcVar.U() != -9223372036854775807L) {
                zi8Var.m(f * ((float) zi8Var.e.U()));
            }
        }
    }

    @Override
    public final void O(float f) {
        dj6 dj6Var = (dj6) this.b;
        k38.e(dj6Var.a).k("-1", f);
        dj6Var.e.setBrushSize(f);
    }

    @Override
    public final void P() {
        x6b x6bVar = (x6b) this.b;
        x6bVar.t0.a.h();
        x6bVar.T0.setViewHidden(false);
    }

    @Override
    public final void Q() {
        RectF rectF = ProfileActivity.Z6;
        tq9.d(new tf8((ProfileActivity) this.b, (byte) 3));
    }

    @Override
    public final void Q0(boolean z) {
        am9 am9Var;
        t7b t7bVar = ((i7b) ((zi8) this.b)).D0;
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            am9 am9Var2 = null;
            if (!z) {
                if (x6bVar.getSelectedEntity() instanceof am9) {
                    t7bVar.w1.D0(null, true);
                }
            } else if (!(x6bVar.getSelectedEntity() instanceof am9)) {
                st7 st7Var = t7bVar.w1.H0;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < st7Var.getChildCount()) {
                        View childAt = st7Var.getChildAt(i2);
                        if (childAt instanceof am9) {
                            am9Var = (am9) childAt;
                            break;
                        }
                        i2++;
                    } else {
                        am9Var = null;
                        break;
                    }
                }
                if (am9Var != null) {
                    x6b x6bVar2 = t7bVar.w1;
                    st7 st7Var2 = x6bVar2.H0;
                    while (true) {
                        if (i >= st7Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = st7Var2.getChildAt(i);
                        if (childAt2 instanceof am9) {
                            am9Var2 = (am9) childAt2;
                            break;
                        }
                        i++;
                    }
                    x6bVar2.D0(am9Var2, true);
                }
            }
        }
    }

    public final String R(String str) {
        String replace;
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override
    public final void S() {
        c64 c64Var = ((fk6) this.b).Y;
        if (c64Var != null) {
            c64Var.a.j0 = true;
        }
    }

    @Override
    public final void T() {
        x6b x6bVar = (x6b) this.b;
        if (x6bVar.z0 != null) {
            x6bVar.D0(null, true);
        }
        x6bVar.T0.setViewHidden(true);
    }

    public final void V(Exception exc) {
        p pVar = (p) this.b;
        if (pVar.R0) {
            return;
        }
        pVar.M0(true, false);
        pVar.I0(false);
        if (!(exc instanceof e1) && !(exc instanceof f1)) {
            ij.t0(exc.getMessage(), pVar);
        } else {
            ij.t0(k96.M0(2131747211, null), pVar);
        }
    }

    public final void W(int i) {
        boolean z;
        TLRPC.TL_exportedNoPaidMessagesToken c;
        kw8 kw8Var = ((gw8) this.b).e;
        if (kw8Var != null && kw8Var.d != i) {
            boolean z2 = true;
            byte b = i;
            b = i;
            if (kw8Var.c.d && i == 2) {
                b = 1;
            }
            kw8Var.d = b;
            SharedPreferences.Editor edit = kw8Var.f().edit();
            if (kw8Var.d == 2) {
                z = true;
            } else {
                z = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z).apply();
            byte b2 = kw8Var.d;
            if (b2 == 0) {
                if (kw8Var.n != 0) {
                    ConnectionsManager.getInstance(kw8Var.a).cancelRequest(kw8Var.n, true);
                    kw8Var.n = 0;
                    return;
                }
                return;
            }
            if (b2 == 2 && (c = kw8Var.c()) != null) {
                kw8Var.f = c;
                kw8Var.b.setFreeLink(kw8Var.d(c));
            }
            if (kw8Var.d != 1) {
                z2 = false;
            }
            kw8Var.n(false, z2);
        }
    }

    @Override
    public final void W0(float f, int i) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar != null && (arrayList = f4bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((f4b) zi8Var.d.T.get(i)).V = f;
        }
    }

    public final boolean X(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z24.X(android.view.MotionEvent):boolean");
    }

    public final Bundle Y() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final byte Z() {
        int read = ((a51) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final void Z0(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.F = f;
        f4bVar.j = true;
        zi8Var.w(true);
    }

    @Override
    public final void a(int i, boolean z) {
        boolean z2;
        b68 b68Var = (b68) this.b;
        a68[] a68VarArr = b68Var.n;
        if (a68VarArr[0].b == i) {
            return;
        }
        if (i == b68Var.h.getFirstTabId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        b68Var.e = z2;
        a68 a68Var = a68VarArr[1];
        a68Var.b = i;
        a68Var.setVisibility(0);
        b68Var.n0(true);
        b68Var.w = z;
        r7 r7Var = b68Var.c;
        if (i == 0) {
            r7Var.setSearchFieldHint(k96.M0(2131745569, null));
        } else {
            r7Var.setSearchFieldHint(k96.M0(2131745572, null));
        }
    }

    public final int a0() {
        return ((Z() & 255) << 24) | ((Z() & 255) << 16) | ((Z() & 255) << 8) | (Z() & 255);
    }

    @Override
    public final ByteBuffer b() {
        lm6 lm6Var = (lm6) this.b;
        lm6Var.p.c();
        return (ByteBuffer) lm6Var.p.f;
    }

    @Override
    public final void b0(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.s0 = f;
        f4bVar.j = true;
        zi8Var.y(true);
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final int c0() {
        return ((Z() & Byte.MAX_VALUE) << 21) | ((Z() & Byte.MAX_VALUE) << 14) | ((Z() & Byte.MAX_VALUE) << 7) | (Z() & Byte.MAX_VALUE);
    }

    @Override
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public final void d(int i) {
        bg6 bg6Var;
        fk6 fk6Var = (fk6) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (bg6Var = fk6Var.d1) != null) {
            bg6Var.d(i);
        }
        tg2 tg2Var = fk6Var.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new eg(tg2Var, i, (byte) 4));
        }
    }

    public final void d0(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = ((a51) this.b).skip(j - j2);
            if (skip > 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final void dismiss() {
        ((wa5) this.b).x.d(true);
    }

    @Override
    public final void e() {
        g48 g48Var = (g48) this.b;
        int size = g48Var.b.size();
        sb sbVar = g48Var.R;
        if (size == 0) {
            sbVar.setPivotX(0.0f);
            g48Var.R.setPivotY(0.0f);
            g48Var.a0(false);
            return;
        }
        sbVar.invalidate();
        g48Var.a0(true);
    }

    @Override
    public final void e1(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.E = f;
        f4bVar.j = true;
        zi8Var.w(true);
    }

    @Override
    public final void f(int i) {
        qk2 qk2Var = ((zi8) this.b).F;
        if (qk2Var != null) {
            ArrayList arrayList = qk2Var.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                pk2 pk2Var = (pk2) obj;
                if (pk2Var.a == i) {
                    pk2Var.b.e(true, 1.0f);
                    qk2Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public final void f1() {
        ((fk6) this.b).u();
    }

    @Override
    public final void g(float f) {
        b68 b68Var = (b68) this.b;
        a68[] a68VarArr = b68Var.n;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i != 0 || a68VarArr[1].getVisibility() == 0) {
            if (b68Var.w) {
                a68 a68Var = a68VarArr[0];
                a68Var.setTranslationX((-f) * a68Var.getMeasuredWidth());
                a68VarArr[1].setTranslationX(a68VarArr[0].getMeasuredWidth() - (f * a68VarArr[0].getMeasuredWidth()));
            } else {
                a68 a68Var2 = a68VarArr[0];
                a68Var2.setTranslationX(a68Var2.getMeasuredWidth() * f);
                a68VarArr[1].setTranslationX((f * a68VarArr[0].getMeasuredWidth()) - a68VarArr[0].getMeasuredWidth());
            }
            if (i == 0) {
                a68 a68Var3 = a68VarArr[0];
                a68VarArr[0] = a68VarArr[1];
                a68VarArr[1] = a68Var3;
                a68Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final float get() {
        dj6 dj6Var = (dj6) this.b;
        m01 currentBrush = dj6Var.e.getCurrentBrush();
        int i = dj6Var.a;
        if (currentBrush == null) {
            return k38.e(i).i;
        }
        return k38.e(i).f("-1", currentBrush.c());
    }

    @Override
    public final float getBlurAngle() {
        return ((lm6) this.b).t;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return ((lm6) this.b).s;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return ((lm6) this.b).r;
    }

    @Override
    public final float getBlurExcludeSize() {
        return ((lm6) this.b).q;
    }

    @Override
    public final int getBlurType() {
        return ((lm6) this.b).n;
    }

    @Override
    public final float getContrastValue() {
        return b00.A(((lm6) this.b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return ((lm6) this.b).a / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return ((lm6) this.b).c / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return ((lm6) this.b).g / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (((lm6) this.b).m / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return b00.y(((lm6) this.b).j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f = ((lm6) this.b).f / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return b00.y(((lm6) this.b).k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return b00.A(((lm6) this.b).o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return ((lm6) this.b).b / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return ((lm6) this.b).i;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (((lm6) this.b).i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return ((lm6) this.b).h;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (((lm6) this.b).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return ((lm6) this.b).l / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return ((lm6) this.b).e / 100.0f;
    }

    @Override
    public final void h(boolean z) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new x6c((byte) 3, tg2Var, z));
        }
    }

    @Override
    public final void i(Object obj) {
        q9 q9Var = (q9) obj;
        go4 go4Var = (go4) this.b;
        co4 co4Var = (co4) go4Var.F.pollLast();
        if (co4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = co4Var.a;
        int i = co4Var.b;
        bn4 n = go4Var.c.n(str);
        if (n == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        n.x(i, q9Var.a, q9Var.b);
    }

    @Override
    public final void j(Editable editable) {
        g48 g48Var = (g48) this.b;
        rt3 rt3Var = g48Var.N;
        g48Var.a = editable;
        rt3Var.setText(editable);
    }

    @Override
    public final void j1(float f, int i) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar != null && (arrayList = f4bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((f4b) zi8Var.d.T.get(i)).W = f;
        }
    }

    @Override
    public final void k0(boolean z) {
        zi8 zi8Var = (zi8) this.b;
        if (zi8Var.i()) {
            zi8Var.F.getClass();
        }
        zi8Var.x(-4, z);
    }

    @Override
    public final void k1(float f) {
        f4b f4bVar = ((zi8) this.b).d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.a0 = f;
        f4bVar.j = true;
    }

    @Override
    public final void l(int i, boolean z, boolean z2) {
        g48 g48Var = (g48) this.b;
        g48Var.removeSelfFromStack();
        if (!z) {
            g48Var.Z(g48Var.b, g48Var.c, z2, i);
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n(int i, int i2) {
        wa5 wa5Var = (wa5) this.b;
        wa5Var.X = i;
        gl.V3(wa5Var.b);
    }

    @Override
    public final void o(long j) {
        fk6 fk6Var = (fk6) this.b;
        fk6Var.o1 = true;
        tg2 tg2Var = fk6Var.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new et(tg2Var, j, (byte) 2));
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((x46) this.b).h(f);
    }

    @Override
    public final void p0(float f, int i) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar != null && (arrayList = f4bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((f4b) zi8Var.d.T.get(i)).P = f;
        }
    }

    @Override
    public final void p1() {
        ((zi8) this.b).p(null);
    }

    @Override
    public final void p2() {
        c64 c64Var = ((fk6) this.b).Y;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override
    public final void r() {
        sb sbVar = ((x6b) this.b).F0;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    @Override
    public final void s() {
        x6b x6bVar = (x6b) this.b;
        if (x6bVar.S0) {
            x6bVar.S0 = false;
            return;
        }
        x6bVar.a1.b(1);
        x6bVar.s((m01) m01.a.get(0));
    }

    @Override
    public final boolean t() {
        return !((lm6) this.b).p.o();
    }

    @Override
    public final void t0(pd5 pd5Var) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 1));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 10:
                a9b a9bVar = a9b.e;
                StringBuffer stringBuffer = new StringBuffer("execution(");
                stringBuffer.append(((ha) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 18:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public final void u(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.u0 = f;
        f4bVar.j = true;
        zi8Var.b();
    }

    @Override
    public final void u0(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.P = f;
        zi8Var.b();
    }

    @Override
    public final void u1(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.t0 = f;
        f4bVar.j = true;
        zi8Var.y(true);
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        op8 op8Var = ((rp8) this.b).h.H0;
        if (op8Var != null) {
            op8Var.d();
        }
    }

    @Override
    public final void w(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.G = f;
        f4bVar.j = true;
        zi8Var.b();
    }

    @Override
    public final void w1(Exception exc) {
        lad.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new j30(tg2Var, exc, (byte) 1));
        }
    }

    @Override
    public final boolean x() {
        boolean z;
        x6b x6bVar = (x6b) this.b;
        if (x6bVar.z0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            x6bVar.D0(null, true);
        }
        return z;
    }

    public final boolean y(String str) {
        String R = R(str);
        if (!"1".equals(R) && !Boolean.parseBoolean(R)) {
            return false;
        }
        return true;
    }

    @Override
    public final void z(long j, boolean z) {
        zi8 zi8Var = (zi8) this.b;
        if (!z) {
            zi8Var.m(j);
            return;
        }
        lbc lbcVar = zi8Var.e;
        if (lbcVar != null) {
            lbcVar.p0(j, true);
        } else if (zi8Var.i()) {
            zi8Var.F.m(j, true);
        } else {
            lbc lbcVar2 = zi8Var.E;
            if (lbcVar2 != null) {
                lbcVar2.p0(j, false);
            }
        }
    }

    @Override
    public final void A() {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }

    public z24(ln8 ln8Var) {
        this.a = (byte) 29;
        this.b = (efd) ln8Var.b;
    }

    public z24(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public z24(byte b, boolean z) {
        this.a = b;
    }

    public z24(Bundle bundle) {
        this.a = (byte) 20;
        this.b = new Bundle(bundle);
    }

    public z24(Context context, Uri uri) {
        this.a = (byte) 3;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public final Object mo9get() {
        return new w86((Context) ((mo5) this.b).a);
    }

    public z24(Context context, ps4 ps4Var) {
        this.a = (byte) 5;
        this.b = new os4(context, ps4Var);
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
