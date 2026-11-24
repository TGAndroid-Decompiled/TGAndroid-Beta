package defpackage;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class ai4 implements fq7, mn4, r9, vj5, y70, g94, zv7, u40, d99, u78, kt9, ldc, wec, rd9 {
    public final byte a;
    public Object b;

    public ai4(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 24:
                this.b = new k6d((byte) 25);
                return;
            default:
                this.b = mo5.p();
                return;
        }
    }

    public static boolean G(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String Z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public final int A(View view) {
        return f69.y(view) - ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).topMargin;
    }

    @Override
    public final void B() {
        z8b z8bVar = (z8b) this.b;
        if (z8bVar.S0) {
            z8bVar.S0 = false;
            return;
        }
        z8bVar.a1.b(1);
        z8bVar.s((u11) u11.a.get(0));
    }

    @Override
    public final void C() {
        l74 l74Var = ((im6) this.b).Y;
        if (l74Var != null) {
            l74Var.a.j0 = true;
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((x66) this.b).h(f);
    }

    @Override
    public final int E() {
        return ((f69) this.b).F();
    }

    @Override
    public final void E1() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            ch9 ch9Var = wg9Var.a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    @Override
    public final boolean F() {
        boolean z;
        z8b z8bVar = (z8b) this.b;
        if (z8bVar.z0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            z8bVar.D0(null, true);
        }
        return z;
    }

    public final void H(Exception exc) {
        p pVar = (p) this.b;
        if (pVar.R0) {
            return;
        }
        pVar.N0(true, false);
        pVar.J0(false);
        if (!(exc instanceof e1) && !(exc instanceof f1)) {
            ik.t0(exc.getMessage(), pVar);
        } else {
            ik.t0(jb6.M0(2131747137, null), pVar);
        }
    }

    @Override
    public final gkb H0() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            return wg9Var.a.getTextSelectionHelper();
        }
        return null;
    }

    public final boolean I(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai4.I(android.view.MotionEvent):boolean");
    }

    public final Bundle J() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final byte K() {
        int read = ((h61) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final void L(nf5 nf5Var) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new m40(lx6Var, nf5Var, (byte) 1));
        }
    }

    @Override
    public final Cursor M(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override
    public final int N() {
        f69 f69Var = (f69) this.b;
        return f69Var.n - f69Var.B();
    }

    @Override
    public final void O(float f) {
        gl6 gl6Var = (gl6) this.b;
        m58.e(gl6Var.a).k("-1", f);
        gl6Var.e.setBrushSize(f);
    }

    @Override
    public final void O0(CharSequence charSequence) {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null && charSequence != null && charSequence.length() > 0) {
            wg9Var.a.u4(charSequence.toString());
        }
    }

    public final int P() {
        return ((K() & 255) << 24) | ((K() & 255) << 16) | ((K() & 255) << 8) | (K() & 255);
    }

    @Override
    public final void Q() {
        z8b z8bVar = (z8b) this.b;
        z8bVar.t0.a.h();
        z8bVar.T0.setViewHidden(false);
    }

    public final int R() {
        return ((K() & Byte.MAX_VALUE) << 21) | ((K() & Byte.MAX_VALUE) << 14) | ((K() & Byte.MAX_VALUE) << 7) | (K() & Byte.MAX_VALUE);
    }

    public final void S(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override
    public final void T() {
        z8b z8bVar = (z8b) this.b;
        if (z8bVar.z0 != null) {
            z8bVar.D0(null, true);
        }
        z8bVar.T0.setViewHidden(true);
    }

    @Override
    public final void V(float f, int i) {
        ((x66) this.b).h(f);
    }

    public final void W(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = ((h61) this.b).skip(j - j2);
            if (skip > 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final void X() {
        ((im6) this.b).u();
    }

    @Override
    public final View Y(int i) {
        return ((f69) this.b).q(i);
    }

    @Override
    public final fkb Y0() {
        return (id9) this.b;
    }

    @Override
    public final void a(int i, boolean z) {
        boolean z2;
        d88 d88Var = (d88) this.b;
        c88[] c88VarArr = d88Var.n;
        if (c88VarArr[0].b == i) {
            return;
        }
        if (i == d88Var.h.getFirstTabId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        d88Var.e = z2;
        c88 c88Var = c88VarArr[1];
        c88Var.b = i;
        c88Var.setVisibility(0);
        d88Var.o0(true);
        d88Var.w = z;
        r7 r7Var = d88Var.c;
        if (i == 0) {
            r7Var.setSearchFieldHint(jb6.M0(2131745495, null));
        } else {
            r7Var.setSearchFieldHint(jb6.M0(2131745498, null));
        }
    }

    @Override
    public final int a0(View view) {
        return f69.v(view) + ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public final void b(int i) {
        bi6 bi6Var;
        im6 im6Var = (im6) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (bi6Var = im6Var.d1) != null) {
            bi6Var.d(i);
        }
        lx6 lx6Var = im6Var.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new eh(lx6Var, i, (byte) 4));
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public final void d(ne9 ne9Var) {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            ch9 ch9Var = wg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override
    public final ll0 d1() {
        return ((id9) this.b).a;
    }

    @Override
    public final void dismiss() {
        switch (this.a) {
            case 6:
                ((uc5) this.b).x.d(true);
                return;
            default:
                ((ProfileActivity) this.b).T0.U(null, null);
                return;
        }
    }

    @Override
    public final void e() {
        j68 j68Var = (j68) this.b;
        int size = j68Var.b.size();
        sb sbVar = j68Var.R;
        if (size == 0) {
            sbVar.setPivotX(0.0f);
            j68Var.R.setPivotY(0.0f);
            j68Var.b0(false);
            return;
        }
        sbVar.invalidate();
        j68Var.b0(true);
    }

    @Override
    public final void f(boolean z) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new y8c((byte) 3, lx6Var, z));
        }
    }

    @Override
    public final void f0(Exception exc) {
        ncd.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new j40(lx6Var, exc, (byte) 1));
        }
    }

    @Override
    public final void g(float f) {
        d88 d88Var = (d88) this.b;
        c88[] c88VarArr = d88Var.n;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i != 0 || c88VarArr[1].getVisibility() == 0) {
            if (d88Var.w) {
                c88 c88Var = c88VarArr[0];
                c88Var.setTranslationX((-f) * c88Var.getMeasuredWidth());
                c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth() - (f * c88VarArr[0].getMeasuredWidth()));
            } else {
                c88 c88Var2 = c88VarArr[0];
                c88Var2.setTranslationX(c88Var2.getMeasuredWidth() * f);
                c88VarArr[1].setTranslationX((f * c88VarArr[0].getMeasuredWidth()) - c88VarArr[0].getMeasuredWidth());
            }
            if (i == 0) {
                c88 c88Var3 = c88VarArr[0];
                c88VarArr[0] = c88VarArr[1];
                c88VarArr[1] = c88Var3;
                c88Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean g1() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null && wg9Var.a.V4()) {
            return true;
        }
        return false;
    }

    @Override
    public final float get() {
        gl6 gl6Var = (gl6) this.b;
        u11 currentBrush = gl6Var.e.getCurrentBrush();
        int i = gl6Var.a;
        if (currentBrush == null) {
            return m58.e(i).i;
        }
        return m58.e(i).f("-1", currentBrush.c());
    }

    @Override
    public final void h(long j) {
        im6 im6Var = (im6) this.b;
        im6Var.o1 = true;
        lx6 lx6Var = im6Var.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new fu(lx6Var, j, (byte) 2));
        }
    }

    @Override
    public final void i(Editable editable) {
        j68 j68Var = (j68) this.b;
        cv3 cv3Var = j68Var.N;
        j68Var.a = editable;
        cv3Var.setText(editable);
    }

    @Override
    public final void i0() {
        ((im6) this.b).l1 = true;
    }

    @Override
    public final void j1(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai4.j1(java.lang.Object):void");
    }

    @Override
    public final void j2() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            wg9Var.a.W3();
        }
    }

    @Override
    public final void k(int i, boolean z, boolean z2) {
        j68 j68Var = (j68) this.b;
        j68Var.removeSelfFromStack();
        if (!z) {
            j68Var.a0(j68Var.b, j68Var.c, z2, i);
        }
    }

    @Override
    public final void l(int i, int i2) {
        int i3;
        switch (this.a) {
            case 6:
                uc5 uc5Var = (uc5) this.b;
                uc5Var.X = i;
                gm.V3(uc5Var.b);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                RectF rectF = ProfileActivity.e7;
                long a = profileActivity.a();
                profileActivity.getMessagesController().P4(i, a);
                if (profileActivity.w2 != null || profileActivity.v2 != null) {
                    UndoView undoView = profileActivity.M;
                    TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(a));
                    TLRPC.UserFull userFull = profileActivity.w2;
                    if (userFull != null) {
                        i3 = userFull.ttl_period;
                    } else {
                        i3 = profileActivity.v2.ttl_period;
                    }
                    undoView.k(a, i2, W1, Integer.valueOf(i3), null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public final void m(Object obj) {
        q9 q9Var = (q9) obj;
        hq4 hq4Var = (hq4) this.b;
        dq4 dq4Var = (dq4) hq4Var.F.pollLast();
        if (dq4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = dq4Var.a;
        int i = dq4Var.b;
        dp4 o = hq4Var.c.o(str);
        if (o == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        o.x(i, q9Var.a, q9Var.b);
    }

    @Override
    public final void n() {
        switch (this.a) {
            case 6:
                return;
            default:
                ((ProfileActivity) this.b).presentFragment(new v70());
                dismiss();
                return;
        }
    }

    public final defpackage.in3 o(defpackage.lx6 r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai4.o(lx6):in3");
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        cl8 cl8Var = (cl8) this.b;
        bl8 bl8Var = cl8Var.M;
        gm.r(bl8Var);
        ndc ndcVar = cl8Var.E;
        if (ndcVar != null && ndcVar.c0()) {
            gm.c3(bl8Var);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((cl8) this.b).h();
    }

    @Override
    public final void p() {
        id9 id9Var = (id9) this.b;
        wg9 wg9Var = id9Var.P;
        if (wg9Var != null) {
            wg9Var.a.T3(id9Var.a);
        }
    }

    public final boolean q(String str) {
        String y = y(str);
        if (!"1".equals(y) && !Boolean.parseBoolean(y)) {
            return false;
        }
        return true;
    }

    public final Integer r(String str) {
        String y = y(str);
        if (!TextUtils.isEmpty(y)) {
            try {
                return Integer.valueOf(Integer.parseInt(y));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + Z(str) + "(" + y + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public final void r1(int i, int i2) {
        of9 of9Var;
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null && (of9Var = wg9Var.a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final void s0() {
        l74 l74Var = ((im6) this.b).Y;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    public final JSONArray t(String str) {
        String y = y(str);
        if (!TextUtils.isEmpty(y)) {
            try {
                return new JSONArray(y);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + Z(str) + ": " + y + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                cbb cbbVar = cbb.e;
                StringBuffer stringBuffer = new StringBuffer("execution(");
                stringBuffer.append(((ha) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public final void u(nf5 nf5Var) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new m40(lx6Var, nf5Var, (byte) 0));
        }
    }

    @Override
    public final void v() {
        ((im6) this.b).n1 = true;
    }

    public final String x(Resources resources, String str, String str2) {
        String[] strArr;
        String y = y(str2);
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String y2 = y(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(y2)) {
            return null;
        }
        int identifier = resources.getIdentifier(y2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Z(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray t = t(str2.concat("_loc_args"));
        if (t == null) {
            strArr = null;
        } else {
            int length = t.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = t.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + Z(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override
    public final void x0(long j, int i, long j2) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new l40(lx6Var, i, j, j2, (byte) 0));
        }
    }

    public final String y(String str) {
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
    public final boolean y0(int i, View view) {
        return false;
    }

    @Override
    public final void z() {
        sb sbVar = ((z8b) this.b).F0;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    private final void U() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
    }

    public ai4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ai4(byte b, boolean z) {
        this.a = b;
    }

    public ai4(Bundle bundle) {
        this.a = (byte) 17;
        this.b = new Bundle(bundle);
    }

    public ai4(Context context, Uri uri) {
        this.a = (byte) 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public ai4(Context context, qu4 qu4Var) {
        this.a = (byte) 3;
        this.b = new pu4(context, qu4Var);
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
