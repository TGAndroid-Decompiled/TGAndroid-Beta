package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public class tg2 implements k6a, zu9, wj0, sc7, we9, m63, d71, et3, lf5, kt8, hk4 {
    public static volatile tg2 d;
    public static final int[] e = {16843067, 16843068};
    public static final c6e f = new Object();
    public static final Object h = new Object();
    public static int n;
    public final byte a;
    public Object b;
    public Object c;

    public tg2(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                return;
            case 11:
                this.b = new lj9((byte) 10);
                this.c = new SparseIntArray();
                return;
            case 14:
                return;
            case 26:
                this.b = new HashMap();
                this.c = uj2.b;
                return;
            default:
                ad1 c = ad1.c(a.b);
                k32 k32Var = new k32((byte) 5);
                c.getClass();
                fre.e("Must be called from the main thread.");
                j6a j6aVar = c.c;
                j6aVar.getClass();
                try {
                    nad nadVar = j6aVar.a;
                    r5d r5dVar = new r5d(k32Var);
                    Parcel R = nadVar.R();
                    jgd.d(R, r5dVar);
                    nadVar.V(R, 4);
                } catch (RemoteException e2) {
                    j6a.c.a(e2, "Unable to call %s on %s.", "addCastStateListener", nad.class.getSimpleName());
                }
                this.b = new mv6((byte) 23);
                j6a b2 = c.b();
                this.c = b2;
                b2.a(this);
                c0(b2.c());
                return;
        }
    }

    public static tg2 N() {
        tg2 tg2Var;
        tg2 tg2Var2 = d;
        if (tg2Var2 == null) {
            synchronized (tg2.class) {
                tg2Var = d;
                if (tg2Var == null) {
                    tg2Var = new tg2((byte) 0);
                    d = tg2Var;
                }
            }
            return tg2Var;
        }
        return tg2Var2;
    }

    public static defpackage.tg2 l(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg2.l(android.content.Context):tg2");
    }

    public static uj2 t(uj2 uj2Var, List list) {
        uj2Var.getClass();
        Map map = uj2Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new uj2(hashMap);
    }

    public final lg7 A(int i, long j, boolean z) {
        lj9 lj9Var = (lj9) this.b;
        if (i > 0) {
            i = ((SparseIntArray) this.c).get(i, 0);
        }
        Object obj = null;
        if (i == 0) {
            return null;
        }
        long j2 = i;
        LongSparseArray x = lj9Var.x(j, 0L);
        if (x != null) {
            obj = x.get(j2);
        }
        lg7 lg7Var = (lg7) obj;
        if (lg7Var == null && z) {
            lg7 lg7Var2 = new lg7();
            lj9Var.G(j, 0L, j2, lg7Var2);
            return lg7Var2;
        }
        return lg7Var;
    }

    @Override
    public final void B(xe9 xe9Var, View view) {
        e72 e72Var = (e72) this.c;
        cs5 cs5Var = new cs5(e72Var, (wjb) this.b, view, false, false, true);
        cs5Var.T = true;
        d dVar = e72Var.b.Z1;
        e72Var.getContext();
        e72Var.I = lf9.b(cs5Var, dVar, xe9Var, true);
    }

    @Override
    public final t56 D(jr6 jr6Var) {
        Uri uri;
        byte[] bArr;
        mv6 mv6Var = (mv6) this.c;
        if (mv6Var != null && (((uri = (Uri) mv6Var.c) != null && uri.equals(jr6Var.n)) || ((bArr = (byte[]) mv6Var.b) != null && Arrays.equals(bArr, jr6Var.k)))) {
            t56 t56Var = (t56) ((mv6) this.c).d;
            t56Var.getClass();
            return t56Var;
        }
        t56 D = ((wj0) this.b).D(jr6Var);
        if (D == null) {
            return null;
        }
        this.c = new mv6(jr6Var, D);
        return D;
    }

    @Override
    public final void E(d5a d5aVar, boolean z) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((ed1) d5aVar).a() + " " + z);
    }

    @Override
    public final void F(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((ed1) d5aVar).a() + " " + i);
    }

    @Override
    public final void G() {
        df9 df9Var = ((e72) this.c).s;
        if (df9Var != null) {
            int i = 0;
            df9Var.e(false, true);
            int i2 = df9Var.c0;
            if (i2 != 2) {
                i = i2;
            }
            df9Var.g(i, true);
        }
    }

    public final j74 I(Object... objArr) {
        Constructor b;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    try {
                        b = ((k93) this.b).b();
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                }
            }
            b = null;
        }
        if (b == null) {
            return null;
        }
        try {
            return (j74) b.newInstance(objArr);
        } catch (Exception e3) {
            k93.h("Unexpected error creating extractor", e3);
            return null;
        }
    }

    @Override
    public final cs5 J(View view) {
        e72 e72Var = (e72) this.c;
        cs5 cs5Var = new cs5(e72Var, (wjb) this.b, view, false, false, true);
        e72Var.I = cs5Var;
        return cs5Var;
    }

    @Override
    public final void K(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((ed1) d5aVar).a() + " " + i);
    }

    @Override
    public final void L() {
        e72 e72Var = (e72) this.c;
        e72Var.c0();
        e72Var.d0();
    }

    @Override
    public final t56 M(byte[] bArr) {
        byte[] bArr2;
        mv6 mv6Var = (mv6) this.c;
        if (mv6Var != null && (bArr2 = (byte[]) mv6Var.b) != null && Arrays.equals(bArr2, bArr)) {
            t56 t56Var = (t56) ((mv6) this.c).d;
            t56Var.getClass();
            return t56Var;
        }
        t56 M = ((wj0) this.b).M(bArr);
        this.c = new mv6(bArr, M);
        return M;
    }

    public final boolean O() {
        if (((sg2) ((mv6) this.b).d) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void P(ve9 ve9Var, View view) {
        e72 e72Var = (e72) this.c;
        cs5 cs5Var = new cs5(e72Var, (wjb) this.b, view, false, false, true);
        cs5Var.T = true;
        e72Var.I = lf9.c(cs5Var, e72Var.b.Z1, e72Var.getContext(), (wjb) this.b, ve9Var, true);
    }

    public void Q(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        vk9 v = vk9.v(absSeekBar.getContext(), attributeSet, e, i);
        Drawable p = v.p(0);
        if (p != null) {
            if (p instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) p;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable Z = Z(animationDrawable.getFrame(i2), true);
                    Z.setLevel(10000);
                    animationDrawable2.addFrame(Z, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                p = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(p);
        }
        Drawable p2 = v.p(1);
        if (p2 != null) {
            absSeekBar.setProgressDrawable(Z(p2, false));
        }
        v.y();
    }

    @Override
    public final void R(d5a d5aVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((ed1) d5aVar).a() + " " + str);
    }

    public final void S(f9 f9Var) {
        wtc wtcVar = (wtc) this.b;
        ((ActionMode.Callback) wtcVar.a).onDestroyActionMode(wtcVar.p(f9Var));
        bp bpVar = (bp) this.c;
        if (bpVar.F != null) {
            bpVar.f.getDecorView().removeCallbacks(bpVar.G);
        }
        if (bpVar.E != null) {
            afc afcVar = bpVar.H;
            if (afcVar != null) {
                afcVar.b();
            }
            afc a = jdc.a(bpVar.E);
            a.a(0.0f);
            bpVar.H = a;
            a.d(new ro(this, (byte) 2));
        }
        bpVar.y = null;
        ViewGroup viewGroup = bpVar.K;
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(viewGroup);
        bpVar.w();
    }

    @Override
    public final void T(d5a d5aVar, String str) {
        ed1 ed1Var = (ed1) d5aVar;
        Log.d("CAST_SESSION", "onSessionStarted " + ed1Var.a() + " " + str);
        c0(ed1Var);
    }

    public final void U(long j, File file) {
        synchronized (((u20) this.c).f) {
            ((HashMap) ((u20) this.c).g).put(Long.valueOf(j), file);
        }
    }

    public final void V(uj2 uj2Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!t(uj2Var, list).equals(t((uj2) this.c, list))) {
                    throw null;
                }
            } else {
                fyb.g();
                return;
            }
        }
        this.c = uj2Var;
    }

    public final boolean W(f9 f9Var, yz6 yz6Var) {
        ViewGroup viewGroup = ((bp) this.c).K;
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(viewGroup);
        wtc wtcVar = (wtc) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) wtcVar.a;
        tbb p = wtcVar.p(f9Var);
        aia aiaVar = (aia) wtcVar.d;
        Menu menu = (Menu) aiaVar.get(yz6Var);
        if (menu == null) {
            menu = new w07((Context) wtcVar.b, yz6Var);
            aiaVar.put(yz6Var, menu);
        }
        return callback.onPrepareActionMode(p, menu);
    }

    public final void X() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public final void Y(yg2 yg2Var) {
        vg2 vg2Var;
        yg2 yg2Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        mv6 mv6Var = (mv6) this.b;
        yg2 yg2Var3 = (yg2) mv6Var.c;
        if (fo.w()) {
            if (yg2Var3 == null) {
                if (yg2Var == null) {
                    return;
                }
            } else {
                ArrayList arrayList = yg2Var3.b;
                if (yg2Var != null && arrayList.size() == yg2Var.b.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        xg2 h2 = yg2Var3.h(i);
                        xg2 h3 = yg2Var.h(i);
                        if (h2 == null) {
                            if (h3 == null) {
                            }
                        } else if (h3 != null && Objects.equals(h2.a, h3.a) && Objects.equals(h2.b, h3.b) && Objects.equals(h2.c, h3.c) && h2.d.equals(h3.d) && h2.e == h3.e && h2.f == h3.f) {
                        }
                    }
                    return;
                }
            }
        }
        if (((sg2) mv6Var.d) != null && yg2Var != null) {
            mv6Var.i(yg2Var);
        }
        if (((sg2) mv6Var.d) != null && (yg2Var2 = (yg2) mv6Var.c) != null) {
            mv6Var.f0(yg2Var2);
        }
        if (yg2Var != null && yg2Var.b.size() > 0 && !yg2Var.h(0).a.startsWith("audio/") && (vg2Var = (vg2) mv6Var.b) != null) {
            vg2Var.k(null, null);
        }
        sg2 sg2Var = (sg2) mv6Var.d;
        if (sg2Var != null && yg2Var != null) {
            sg2Var.d = yg2Var;
            sg2Var.g = 0;
            sg2Var.h = 0;
            sg2Var.p();
        }
        mv6Var.c = yg2Var;
    }

    public final Drawable Z(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = Z(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        } else {
            return drawable;
        }
    }

    @Override
    public final boolean a(float r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg2.a(float):boolean");
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final void b(wi9 wi9Var, String str) {
        e72 e72Var = (e72) this.c;
        eq2 eq2Var = e72Var.w;
        if (eq2Var == null) {
            wjb wjbVar = (wjb) this.b;
            eq2Var = new eq2(new q31(this, wjbVar, (byte) 28), wjbVar);
            e72Var.w = eq2Var;
        }
        eq2Var.z(wi9Var, str);
    }

    public final wxb b0(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return ((gp9[]) this.c)[i2];
                }
                i2++;
            } else {
                lad.c("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new yn3();
            }
        }
    }

    @Override
    public final void c(int i) {
        ((e72) this.c).T(74, i);
    }

    public final void c0(ed1 ed1Var) {
        String str;
        String M0;
        mv6 mv6Var = (mv6) this.b;
        if (ed1Var != null) {
            fre.e("Must be called from the main thread.");
            i69 i69Var = ed1Var.j;
            String a = ed1Var.a();
            if (!TextUtils.isEmpty(a) && i69Var != null) {
                sg2 sg2Var = (sg2) mv6Var.d;
                if (sg2Var == null || !TextUtils.equals(sg2Var.c.a(), a)) {
                    mv6Var.l0(new sg2(ed1Var, (j6a) this.c, i69Var));
                    fre.e("Must be called from the main thread.");
                    CastDevice castDevice = ed1Var.k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer r0 = PhotoViewer.r0();
                    vg2.h();
                    if (r0.F != null && r0.f0 != null && r0.V0()) {
                        u21 u21Var = new u21(r0.f0, new f53());
                        if (!TextUtils.isEmpty(str)) {
                            M0 = k96.a0(null, null, 2131752090, str);
                        } else {
                            M0 = k96.M0(2131752091, null);
                        }
                        u21Var.Q(2131624029, 36, M0).j();
                    }
                }
            }
        }
    }

    @Override
    public final o63 createDataSource() {
        return new x93((Context) this.b, ((xf4) this.c).createDataSource());
    }

    @Override
    public final bv7 d(hf5 hf5Var, df5 df5Var) {
        ((ize) this.b).getClass();
        return new lv6(new kf5(hf5Var, df5Var), (List) this.c, false, (byte) 27);
    }

    public final int d0(int i) {
        synchronized (h) {
            int i2 = ((SparseIntArray) this.b).get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = n;
            n = i3 + 1;
            ((SparseIntArray) this.b).append(i, i3);
            ((SparseIntArray) this.c).append(i3, i);
            return i3;
        }
    }

    @Override
    public final void dismiss() {
        ((je3) this.c).dismiss();
    }

    @Override
    public final void e() {
        int i;
        e72 e72Var = (e72) this.c;
        ye9 ye9Var = e72Var.r;
        df9 df9Var = e72Var.s;
        if (df9Var != null) {
            me9 me9Var = ye9Var.v3;
            if (me9Var != null && me9Var.w() && ye9Var.E4()) {
                i = 1;
            } else {
                i = 0;
            }
            if (df9Var.b0 == 2) {
                df9Var.c0 = i;
            } else {
                df9Var.g(i, true);
            }
            if (i != 0) {
                e72Var.b0();
            }
        }
        e72Var.e0();
    }

    @Override
    public final void f() {
        df9 df9Var = ((e72) this.c).s;
        if (df9Var != null) {
            int i = df9Var.b0;
            if (i == 2) {
                i = 0;
            }
            df9Var.c0 = i;
            df9Var.e(false, false);
            df9Var.g(2, true);
        }
    }

    @Override
    public final void g(mc9 mc9Var, boolean z) {
        ((e72) this.c).b.c1(mc9Var, z);
    }

    @Override
    public final Object mo9get() {
        Context context = (Context) ((mo5) this.b).a;
        sw2 sw2Var = (sw2) ((mo5) this.c).a;
        context.getClass();
        sw2Var.getClass();
        return hh4.a(cff.d, new ln8(new tw2((byte) 1), (byte) 5), h9e.a(sw2Var), new gh4(context, (byte) 0));
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final java.lang.Object h(defpackage.ik4 r7, defpackage.fw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg2.h(ik4, fw2):java.lang.Object");
    }

    @Override
    public final void i(l61 l61Var, u61 u61Var, boolean z) {
        je3 je3Var = (je3) this.c;
        ie3 ie3Var = je3Var.S1;
        if (u61Var != null) {
            ((v61) this.b).i(u61Var);
            je3Var.Z1.e();
            v61 v61Var = je3Var.b2;
            f15[] f15VarArr = je3Var.W1;
            ag2[] ag2VarArr = je3Var.X1;
            ag2 ag2Var = ag2VarArr[0];
            if (ag2Var != null) {
                f15 f15Var = f15VarArr[0];
                boolean z2 = v61Var.m;
                f15Var.b = z2;
                ag2Var.c(z2, true);
            }
            ag2 ag2Var2 = ag2VarArr[1];
            if (ag2Var2 != null) {
                f15 f15Var2 = f15VarArr[1];
                boolean z3 = v61Var.n;
                f15Var2.b = z3;
                ag2Var2.c(z3, true);
            }
            ag2 ag2Var3 = ag2VarArr[2];
            if (ag2Var3 != null) {
                f15 f15Var3 = f15VarArr[2];
                boolean z4 = v61Var.o;
                f15Var3.b = z4;
                ag2Var3.c(z4, true);
            }
            ag2 ag2Var4 = ag2VarArr[3];
            if (ag2Var4 != null) {
                f15 f15Var4 = f15VarArr[3];
                boolean z5 = v61Var.p;
                f15Var4.b = z5;
                ag2Var4.c(z5, true);
            }
            ag2 ag2Var5 = ag2VarArr[4];
            if (ag2Var5 != null) {
                f15 f15Var5 = f15VarArr[4];
                boolean z6 = v61Var.q;
                f15Var5.b = z6;
                ag2Var5.c(z6, true);
            }
            je3Var.V1.a(ie3Var.d(), true);
            ie3Var.c(true);
        }
    }

    @Override
    public final void j(boolean z, float f2) {
        ((TextView) this.b).setText("Alpha " + xk0.o1);
        xk0.o1 = f2;
        ((xk0) this.c).l1.K();
    }

    @Override
    public final void k(boolean z) {
        y71 y71Var = ((w71) this.c).b;
        y71Var.y.finishFragment();
        b81 b81Var = y71Var.y;
        ((mu1) this.b).d6(b81Var.Q, b81Var.R + 86400, z);
    }

    @Override
    public final void m() {
        ((ws3) this.c).b(((gt3) this.b).getText());
    }

    @Override
    public final void n(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((ed1) d5aVar).a() + " " + i);
        ((mv6) this.b).l0(null);
    }

    @Override
    public final bv7 o() {
        return new lv6(((ize) this.b).o(), (List) this.c, false, (byte) 27);
    }

    @Override
    public final void onContentChanged() {
        e72 e72Var = (e72) this.c;
        df9 df9Var = e72Var.s;
        if (df9Var != null) {
            df9Var.setSendLoading(e72Var.r.i3());
        }
        e72Var.Z(true);
        e72Var.d0();
        t62 t62Var = e72Var.Q;
        gl.r(t62Var);
        gl.d3(t62Var, 1000L);
    }

    @Override
    public final void p(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
        Log.d("CAST_SESSION", "onSessionStarting " + ed1Var.a());
        c0(ed1Var);
    }

    @Override
    public final void q(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((ed1) d5aVar).a() + " " + i);
    }

    public final void r() {
        String str = (String) this.b;
        try {
            new File((File) ((jb4) this.c).c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    @Override
    public final void s() {
        e72 e72Var = (e72) this.c;
        if (e72Var.getCurrentItemTop() != e72Var.J) {
            e72Var.b.H1(e72Var, 0);
        }
        e72Var.f0();
        e72Var.a0();
    }

    public final String toString() {
        switch (this.a) {
            case 9:
                try {
                    qj0 qj0Var = (qj0) this.c;
                    if (qj0Var == null) {
                        qj0Var = ((mv6) this.b).H();
                        this.c = qj0Var;
                    }
                    return qj0Var.toString();
                } catch (uj7 unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public final void u(w83 w83Var) {
        synchronized (w83Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k30(this, w83Var, (byte) 0));
        }
    }

    public final ArrayList v() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.b;
        Class cls = (Class) ((qx4) this.c).a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new zp2(str2, (byte) 0));
        }
        return arrayList2;
    }

    @Override
    public final void w(lk0 lk0Var) {
        e72 e72Var = (e72) this.c;
        x02 x02Var = e72Var.b;
        d dVar = x02Var.Z1;
        if (dVar != null && lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockMap) && gl.H1(dVar)) {
            x02 x02Var2 = new x02(e72Var.getContext(), x02Var.Z1, false, false, false, null);
            x02Var2.W3 = new Object();
            x02Var2.J1 = true;
            x02Var2.u3.setVisibility(8);
            x02Var2.t4 = new ie(e72Var, lk0Var, x02Var2, (byte) 26);
            x02Var2.Z0();
            x02Var2.show();
        }
    }

    @Override
    public final void x(int i) {
        e72 e72Var = (e72) this.c;
        e72Var.b.H1(e72Var, i);
        e72Var.f0();
        e72Var.a0();
    }

    @Override
    public final void z(d5a d5aVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((ed1) d5aVar).a());
    }

    @Override
    public final void H() {
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void y() {
    }

    public tg2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public tg2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public tg2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public tg2(jb4 jb4Var) {
        this.a = (byte) 2;
        this.b = jb4Var;
        this.c = f;
    }

    public tg2(Context context) {
        this.a = (byte) 21;
        xf4 xf4Var = new xf4((byte) 5);
        this.b = context.getApplicationContext();
        this.c = xf4Var;
    }

    public tg2(Handler handler, o30 o30Var) {
        this.a = (byte) 7;
        if (o30Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = o30Var;
    }

    public tg2(EditText editText) {
        this.a = (byte) 25;
        this.b = editText;
        gy3 gy3Var = new gy3(editText);
        this.c = gy3Var;
        editText.addTextChangedListener(gy3Var);
        if (pw3.b == null) {
            synchronized (pw3.a) {
                if (pw3.b == null) {
                    ?? factory = new Editable.Factory();
                    try {
                        pw3.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, pw3.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    pw3.b = factory;
                }
            }
        }
        editText.setEditableFactory(pw3.b);
    }

    public tg2(k93 k93Var) {
        this.a = (byte) 22;
        this.b = k93Var;
        this.c = new AtomicBoolean(false);
    }
}
