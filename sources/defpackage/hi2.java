package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public class hi2 implements m8a, cx9, id2, wp2, SuccessContinuation, i59, kh5 {
    public static volatile hi2 d;
    public static final int[] e = {16843067, 16843068};
    public static final f8e f = new Object();
    public static final Object h = new Object();
    public static int n;
    public final byte a;
    public Object b;
    public Object c;

    public hi2(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                return;
            case 8:
                this.b = ByteBuffer.allocateDirect(500);
                return;
            case 21:
                this.b = new HashSet();
                return;
            case 27:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                ie1 c = ie1.c(a.b);
                a32 a32Var = new a32((byte) 6);
                c.getClass();
                ite.e("Must be called from the main thread.");
                l8a l8aVar = c.c;
                l8aVar.getClass();
                try {
                    pcd pcdVar = l8aVar.a;
                    t7d t7dVar = new t7d(a32Var);
                    Parcel R = pcdVar.R();
                    kid.d(R, t7dVar);
                    pcdVar.V(R, 4);
                } catch (RemoteException e2) {
                    l8a.c.a(e2, "Unable to call %s on %s.", "addCastStateListener", pcd.class.getSimpleName());
                }
                this.b = new mx6((byte) 23);
                l8a b2 = c.b();
                this.c = b2;
                b2.a(this);
                W(b2.c());
                return;
        }
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int[] iArr2, int i2) {
        arrayList.add(k73.a[i]);
        if (i2 != 0) {
            iArr2[0] = iArr2[0] + 1;
        }
        iArr[0] = (i * iArr2[0]) + iArr[0];
    }

    public static boolean f(int r7, int r8, java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi2.f(int, int, java.lang.CharSequence):boolean");
    }

    public static boolean j(Editable editable, KeyEvent keyEvent, boolean z) {
        y5c[] y5cVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (y5cVarArr = (y5c[]) editable.getSpans(selectionStart, selectionEnd, y5c.class)) != null && y5cVarArr.length > 0) {
                for (y5c y5cVar : y5cVarArr) {
                    int spanStart = editable.getSpanStart(y5cVar);
                    int spanEnd = editable.getSpanEnd(y5cVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public static hi2 v() {
        hi2 hi2Var;
        hi2 hi2Var2 = d;
        if (hi2Var2 == null) {
            synchronized (hi2.class) {
                hi2Var = d;
                if (hi2Var == null) {
                    hi2Var = new hi2((byte) 0);
                    d = hi2Var;
                }
            }
            return hi2Var;
        }
        return hi2Var2;
    }

    public static boolean y(defpackage.by3 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi2.y(by3, android.text.Editable, int, int, boolean):boolean");
    }

    public final boolean A(CharSequence charSequence, int i, int i2, fy3 fy3Var) {
        byte b;
        if (fy3Var.c == 0) {
            xb3 xb3Var = (xb3) this.c;
            qf7 b2 = fy3Var.b();
            int a = b2.a(8);
            if (a != 0) {
                b2.b.getShort(a + b2.a);
            }
            xb3Var.getClass();
            ThreadLocal threadLocal = xb3.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = xb3Var.a;
            String sb2 = sb.toString();
            int i3 = cu7.a;
            if (textPaint.hasGlyph(sb2)) {
                b = 2;
            } else {
                b = 1;
            }
            fy3Var.c = b;
        }
        if (fy3Var.c != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void B(f7a f7aVar, boolean z) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((me1) f7aVar).a() + " " + z);
    }

    @Override
    public final void C(f7a f7aVar, int i) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((me1) f7aVar).a() + " " + i);
    }

    public final boolean D() {
        if (((gi2) ((mx6) this.b).d) != null) {
            return true;
        }
        return false;
    }

    public void E(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.a) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                wm9 v = wm9.v(absSeekBar.getContext(), attributeSet, e, i);
                Drawable m = v.m(0);
                if (m != null) {
                    if (m instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) m;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable V = V(animationDrawable.getFrame(i2), true);
                            V.setLevel(10000);
                            animationDrawable2.addFrame(V, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        m = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(m);
                }
                Drawable m2 = v.m(1);
                if (m2 != null) {
                    absSeekBar.setProgressDrawable(V(m2, false));
                }
                v.y();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, k09.i, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    S(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public final by3 F(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ni6 ni6Var = (ni6) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            lx6 lx6Var = (lx6) ni6Var.b;
            if (!(inputConnection instanceof by3)) {
                inputConnection = new by3((EditText) lx6Var.b, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (by3) inputConnection2;
    }

    @Override
    public final void H(long j) {
        ((d) this.b).presentFragment(yv1.ga(j));
        ((pp2) this.c).dismiss();
    }

    public final void J(long j, byte[] bArr) {
        File file;
        u30 u30Var = (u30) this.c;
        if (u30Var.a) {
            u30Var.a = false;
            ((h40) u30Var.e).h();
            return;
        }
        h40 h40Var = (h40) u30Var.e;
        h40Var.getClass();
        h40.q();
        f40 f40Var = h40Var.z;
        if (h40Var.G == 5 && f40Var != null) {
            file = f40Var.b;
        } else {
            file = null;
        }
        on6 on6Var = (on6) this.b;
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = on6Var.a;
            String[] strArr = MediaController.W1;
            fc4.e("AudioRecorderV2 failed", illegalStateException);
            nm7.f(mediaController.i1).k(nm7.m2, Integer.valueOf(mediaController.h1));
            mediaController.s(false);
            return;
        }
        MediaController mediaController2 = on6Var.a;
        mediaController2.k1 = file;
        mediaController2.l1 = j;
        mediaController2.F0(file, j, bArr);
        hs6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, cs6.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        nm7.f(mediaController2.i1).k(nm7.o2, new Object[0]);
        nm7.f(mediaController2.i1).k(nm7.s2, Integer.valueOf(mediaController2.h1), mediaController2.g1, file.getAbsolutePath());
        mediaController2.X(false);
        MediaController.i0(false);
    }

    public final void K(Exception exc, boolean z) {
        int i;
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        mo5 q = mo5.q(hashSet);
        hashSet.clear();
        ko5 listIterator = q.listIterator(0);
        while (listIterator.hasNext()) {
            mb3 mb3Var = (mb3) listIterator.next();
            mb3Var.getClass();
            if (z) {
                i = 1;
            } else {
                i = 3;
            }
            mb3Var.l(i, exc);
        }
    }

    @Override
    public final void L(f7a f7aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((me1) f7aVar).a() + " " + i);
    }

    public final void M(vn4 vn4Var) {
        yj0 yj0Var = (yj0) this.c;
        x59 x59Var = (x59) this.b;
        int i = vn4Var.b;
        if (i == 0) {
            yj0Var.execute(new tnd(x59Var, vn4Var.a, (byte) 3));
        } else {
            yj0Var.execute(new sw(x59Var, i));
        }
    }

    public final void N(Object obj) {
        Runnable runnable = (Runnable) this.c;
        if (runnable != null && obj.equals(this.b)) {
            this.c = null;
            runnable.run();
        }
    }

    public final void O(mb3 mb3Var) {
        ((HashSet) this.b).add(mb3Var);
        if (((mb3) this.c) != null) {
            return;
        }
        this.c = mb3Var;
        s64 c = mb3Var.b.c();
        mb3Var.z = c;
        kb3 kb3Var = mb3Var.s;
        String str = hac.a;
        c.getClass();
        kb3Var.getClass();
        kb3Var.obtainMessage(1, new lb3(ea6.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
    }

    @Override
    public final void P(f7a f7aVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((me1) f7aVar).a() + " " + str);
    }

    public final void Q(mi2 mi2Var) {
        ji2 ji2Var;
        mi2 mi2Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        mx6 mx6Var = (mx6) this.b;
        mi2 mi2Var3 = (mi2) mx6Var.c;
        if (fp.w()) {
            if (mi2Var3 == null) {
                if (mi2Var == null) {
                    return;
                }
            } else {
                ArrayList arrayList = mi2Var3.a;
                if (mi2Var != null && arrayList.size() == mi2Var.a.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        li2 c = mi2Var3.c(i);
                        li2 c2 = mi2Var.c(i);
                        if (c == null) {
                            if (c2 == null) {
                            }
                        } else if (c2 != null && Objects.equals(c.a, c2.a) && Objects.equals(c.b, c2.b) && Objects.equals(c.c, c2.c) && c.d.equals(c2.d) && c.e == c2.e && c.f == c2.f) {
                        }
                    }
                    return;
                }
            }
        }
        if (((gi2) mx6Var.d) != null && mi2Var != null) {
            mx6Var.q(mi2Var);
        }
        if (((gi2) mx6Var.d) != null && (mi2Var2 = (mi2) mx6Var.c) != null) {
            mx6Var.j0(mi2Var2);
        }
        if (mi2Var != null && mi2Var.a.size() > 0 && !mi2Var.c(0).a.startsWith("audio/") && (ji2Var = (ji2) mx6Var.b) != null) {
            ji2Var.k(null, null);
        }
        gi2 gi2Var = (gi2) mx6Var.d;
        if (gi2Var != null && mi2Var != null) {
            gi2Var.d = mi2Var;
            gi2Var.g = 0;
            gi2Var.h = 0;
            gi2Var.p();
        }
        mx6Var.c = mi2Var;
    }

    @Override
    public final void R(f7a f7aVar, String str) {
        me1 me1Var = (me1) f7aVar;
        Log.d("CAST_SESSION", "onSessionStarted " + me1Var.a() + " " + str);
        W(me1Var);
    }

    public final void S(boolean z) {
        qz3 qz3Var = (qz3) ((lx6) ((ni6) this.c).b).c;
        if (qz3Var.c != z) {
            if (qz3Var.b != null) {
                wx3 a = wx3.a();
                pz3 pz3Var = qz3Var.b;
                a.getClass();
                nte.a(pz3Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(pz3Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            qz3Var.c = z;
            if (z) {
                qz3.a(qz3Var.a, wx3.a().b());
            }
        }
    }

    public final void T(ln8 ln8Var) {
        this.b = ln8Var;
        if (ln8Var.a() != null) {
            ln8Var.a().getClass();
            String str = ln8Var.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    @Override
    public final void U() {
        pp2 pp2Var = (pp2) this.c;
        pp2Var.v1.d.g3.O(true);
        pp2Var.u1.d.g3.O(true);
    }

    public final Drawable V(Drawable drawable, boolean z) {
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
                drawableArr[i] = V(drawable2, z2);
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

    public final void W(me1 me1Var) {
        String str;
        String M0;
        mx6 mx6Var = (mx6) this.b;
        if (me1Var != null) {
            ite.e("Must be called from the main thread.");
            k89 k89Var = me1Var.j;
            String a = me1Var.a();
            if (!TextUtils.isEmpty(a) && k89Var != null) {
                gi2 gi2Var = (gi2) mx6Var.d;
                if (gi2Var == null || !TextUtils.equals(gi2Var.c.a(), a)) {
                    mx6Var.p0(new gi2(me1Var, (l8a) this.c, k89Var));
                    ite.e("Must be called from the main thread.");
                    CastDevice castDevice = me1Var.k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer r0 = PhotoViewer.r0();
                    ji2.h();
                    if (r0.F != null && r0.f0 != null && r0.V0()) {
                        c41 c41Var = new c41(r0.f0, new r63());
                        if (!TextUtils.isEmpty(str)) {
                            M0 = jb6.a0(null, null, 2131752039, str);
                        } else {
                            M0 = jb6.M0(2131752040, null);
                        }
                        c41Var.Q(2131624029, 36, M0).j();
                    }
                }
            }
        }
    }

    public final void X(ArrayList arrayList) {
        iq7 iq7Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((hq7) arrayList.get(i)).a == 1) {
                try {
                    iq7Var = new iq7((hq7) arrayList.get(i));
                } catch (gq7 unused) {
                    iq7Var = null;
                }
                this.c = iq7Var;
            }
        }
    }

    public final int Y(int i) {
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
    public final cx7 a(gh5 gh5Var, ch5 ch5Var) {
        ((k1f) this.b).getClass();
        return new lx6(new jh5(gh5Var, ch5Var), (List) this.c, (byte) 27);
    }

    public final dj0 c() {
        if (((ln8) this.b) != null) {
            return new dj0(this);
        }
        gxc.d("ProductDetails is required for constructing ProductDetailsParams.");
        return null;
    }

    @Override
    public final void close() {
        ((pp2) this.c).n1.E(0);
    }

    @Override
    public final boolean mo14d(float f2, float f3, int i, View view) {
        switch (this.a) {
            case 24:
                nk3 nk3Var = (nk3) this.c;
                if (view instanceof hg3) {
                    hg3 hg3Var = (hg3) view;
                    if (hg3Var.o2) {
                        nk3Var.i5(hg3Var.getDialogId(), view);
                        return true;
                    }
                }
                ak3 ak3Var = nk3Var.A0;
                if (ak3Var != null && ak3Var.getVisibility() == 0 && nk3Var.A0.n) {
                    return false;
                }
                return nk3Var.D4(view, i, f2, ((mk3) this.b).d);
            default:
                Rect rect = (Rect) this.b;
                kv3 kv3Var = (kv3) this.c;
                if (kv3Var.getParentActivity() != null && (view instanceof xc5)) {
                    ((ImageView) view.getTag(2131296587)).getHitRect(rect);
                    if (!rect.contains((int) f2, (int) f3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kv3Var.getParentActivity());
                        alertDialog$Builder.e(new CharSequence[]{jb6.M0(2131751535, null)}, new fv3(this, i, (byte) 0));
                        kv3Var.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final void dismiss() {
        ((bu5) this.b).u();
    }

    @Override
    public final cx7 e() {
        return new lx6(((k1f) this.b).e(), (List) this.c, (byte) 27);
    }

    public final boolean g(int i) {
        return ((lk4) this.b).a.get(i);
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void i() {
        switch (this.a) {
            case 24:
                Point point = gm.q;
                if (point.x > point.y) {
                    ((nk3) this.c).finishPreviewFragment();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void k(float f2) {
        switch (this.a) {
            case 24:
                Point point = gm.q;
                if (point.x > point.y) {
                    ((nk3) this.c).movePreviewFragment(f2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(f7a f7aVar, int i) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((me1) f7aVar).a() + " " + i);
        ((mx6) this.b).p0(null);
    }

    public final int m(int i, int i2, CharSequence charSequence) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        String str;
        int i10 = ((int[][]) this.b)[wi8.F(i)][i2];
        if (i10 > 0) {
            return i10;
        }
        int i11 = i2 + 1;
        if (i11 >= charSequence.length()) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = {1, 2};
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 5;
        for (int i15 = 1; i12 <= i15; i15 = 1) {
            if (f(iArr[i12], i2, charSequence)) {
                int i16 = iArr[i12];
                if (i != i16) {
                    z2 = z;
                    if (i16 != i15) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                i6 = 4;
                                if (i16 == 4) {
                                    str = "NONE";
                                } else {
                                    throw null;
                                }
                            } else {
                                i6 = 4;
                                str = "C";
                            }
                        } else {
                            i6 = 4;
                            str = "B";
                        }
                    } else {
                        i6 = 4;
                        str = "A";
                    }
                    if (str.equals("A")) {
                        i8 = 1;
                    } else if (str.equals("B")) {
                        i8 = 2;
                    } else if (str.equals("C")) {
                        i8 = 3;
                    } else if (str.equals("SHIFT")) {
                        i8 = i6;
                    } else if (str.equals("NONE")) {
                        i8 = 5;
                    } else {
                        u36.j("No enum constant com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.".concat(str));
                        i8 = 0;
                    }
                    i7 = 2;
                } else {
                    z2 = z;
                    i6 = 4;
                    i7 = 1;
                    i8 = 5;
                }
                if (!z2) {
                    i7 += m(iArr[i12], i11, charSequence);
                }
                if (i7 < i13) {
                    i13 = i7;
                    i14 = i8;
                }
                if (i == iArr[(i12 + 1) % 2]) {
                    if (!z2) {
                        i9 = m(i, i11, charSequence) + 2;
                    } else {
                        i9 = 2;
                    }
                    if (i9 < i13) {
                        i13 = i9;
                        i14 = i6;
                    }
                }
            } else {
                z2 = z;
            }
            i12++;
            z = z2;
        }
        if (f(3, i2, charSequence)) {
            if (i != 3) {
                i4 = 3;
                i3 = 2;
            } else {
                i3 = 1;
                i4 = 5;
            }
            if (charSequence.charAt(i2) == 241) {
                i5 = 1;
            } else {
                i5 = 2;
            }
            int i17 = i2 + i5;
            if (i17 < charSequence.length()) {
                i3 += m(3, i17, charSequence);
            }
            if (i3 < i13) {
                i13 = i3;
                i14 = i4;
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            ((int[][]) this.b)[wi8.F(i)][i2] = i13;
            ((int[][]) this.c)[wi8.F(i)][i2] = i14;
            return i13;
        }
        zo4.g(charSequence.charAt(i2), "Bad character in input: ASCII value=");
        return 0;
    }

    @Override
    public final void n(boolean z, float f2) {
        xl0.m1 = f2;
        ((TextView) this.b).setText("Saturation " + (f2 * 5.0f));
        ela elaVar = ((xl0) this.c).l1;
        elaVar.M();
        elaVar.K();
    }

    @Override
    public final void o(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
        Log.d("CAST_SESSION", "onSessionStarting " + me1Var.a());
        W(me1Var);
    }

    @Override
    public final void p() {
        ((bu5) this.b).u();
        yv1 yv1Var = (yv1) this.c;
        yv1Var.Hc(true);
        c41.A(yv1Var, yv1Var.getMessagesController().o2(yv1Var.l6, yv1Var.d(), null), yv1Var.Ba).j();
    }

    @Override
    public final void q(f7a f7aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((me1) f7aVar).a() + " " + i);
    }

    @Override
    public final void r() {
        ((bu5) this.b).u();
        yv1 yv1Var = (yv1) this.c;
        if (yv1Var.l6 != 0 && yv1Var.g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", yv1Var.l6);
            if (yv1Var.d() != 0) {
                bundle.putLong("topic_id", yv1Var.d());
            }
            yv1Var.presentFragment(new st8(bundle, yv1Var.Ba));
        }
    }

    @Override
    public final void s() {
        int i;
        ((bu5) this.b).u();
        yv1 yv1Var = (yv1) this.c;
        i = ((d) yv1Var).currentAccount;
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + lo7.p(yv1Var.l6, yv1Var.d(), false), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + lo7.p(yv1Var.l6, yv1Var.d(), false), z2).apply();
        if (c41.a(yv1Var)) {
            c41.S(z ? 1 : 0, yv1Var.getResourceProvider(), yv1Var).j();
        }
        yv1Var.yd(false);
    }

    @Override
    public final void t(int i) {
        ((bu5) this.b).u();
        yv1 yv1Var = (yv1) this.c;
        if (i == 0) {
            if (yv1Var.getMessagesController().o2(yv1Var.l6, yv1Var.d(), null)) {
                yv1Var.Hc(true);
            }
            if (c41.a(yv1Var)) {
                c41.z(yv1Var, 4, i, yv1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        yv1Var.getNotificationsController().H(yv1Var.l6, i, yv1Var.d());
        if (c41.a(yv1Var)) {
            c41.z(yv1Var, 5, i, yv1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        nz2 nz2Var = (nz2) this.c;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            jd4 jd4Var = nz2Var.g;
            for (File file : jd4.e(((File) jd4Var.c).listFiles(nz2.r))) {
                file.delete();
            }
            jd4 jd4Var2 = nz2Var.m.b.b;
            y03.b(jd4.e(((File) jd4Var2.e).listFiles()));
            y03.b(jd4.e(((File) jd4Var2.f).listFiles()));
            y03.b(jd4.e(((File) jd4Var2.g).listFiles()));
            nz2Var.q.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue = bool.booleanValue();
        i73 i73Var = nz2Var.b;
        if (booleanValue) {
            i73Var.h.trySetResult(null);
            return ((Task) this.b).onSuccessTask((a13) nz2Var.e.b, new ni6(this, (byte) 21));
        }
        dq9.m("An invalid data collection token was used.");
        return null;
    }

    public final byte[] u(u54 u54Var) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(u54Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(u54Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(u54Var.c);
            dataOutputStream.writeLong(u54Var.d);
            dataOutputStream.write(u54Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            rjb.m(e2);
            return null;
        }
    }

    public final KeyListener w(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            if (keyListener instanceof ey3) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new ey3(keyListener);
        }
        return keyListener;
    }

    @Override
    public final void z(f7a f7aVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((me1) f7aVar).a());
    }

    private final void G() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void x() {
    }

    private final void I(float f2) {
    }

    public hi2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public hi2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public hi2(byte b, boolean z) {
        this.a = b;
    }

    public hi2(Context context) {
        this.a = (byte) 23;
        this.b = context;
        this.c = null;
    }

    public hi2(jd4 jd4Var) {
        this.a = (byte) 2;
        this.b = jd4Var;
        this.c = f;
    }

    public hi2(AbsSeekBar absSeekBar) {
        this.a = (byte) 1;
        this.b = absSeekBar;
    }

    public hi2(EditText editText) {
        this.a = (byte) 6;
        this.b = editText;
        this.c = new ni6(editText);
    }

    public hi2(y73 y73Var) {
        this.a = (byte) 20;
        m41 m41Var = new m41((byte) 0);
        m41Var.c = new fgf((byte) 17);
        this.c = m41Var;
        this.b = y73Var;
    }

    public hi2(lk4 lk4Var, SparseArray sparseArray) {
        this.a = (byte) 5;
        this.b = lk4Var;
        SparseBooleanArray sparseBooleanArray = lk4Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a = lk4Var.a(i);
            tk tkVar = (tk) sparseArray.get(a);
            tkVar.getClass();
            sparseArray2.append(a, tkVar);
        }
        this.c = sparseArray2;
    }

    public hi2(e7a e7aVar, jk2 jk2Var, xb3 xb3Var) {
        this.a = (byte) 26;
        this.b = e7aVar;
        this.c = xb3Var;
    }

    public hi2(je3 je3Var) {
        this.a = (byte) 22;
        this.c = je3Var;
    }

    public hi2(kv3 kv3Var) {
        this.a = (byte) 25;
        this.c = kv3Var;
        this.b = new Rect();
    }
}
