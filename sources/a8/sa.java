package a8;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.widget.TextView;
import c8.cd;
import c8.jg;
import c8.uf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import org.telegram.messenger.camera.CameraView;
public final class sa implements Runnable {
    public final int f640a;
    public final Object f641b;

    public sa(uf ufVar) {
        this.f640a = 16;
        c8.fb fbVar = c8.fb.UNKNOWN_EVENT;
        this.f641b = ufVar;
    }

    @Override
    public final void run() {
        f fVar;
        boolean z10;
        boolean z11;
        ai.g2[] g2VarArr;
        boolean z12;
        boolean z13;
        ai.h2[] h2VarArr;
        int i7;
        int i10;
        Layout layout;
        float lineRight;
        int i11;
        long j3;
        Object obj;
        f fVar2;
        int i12 = 3;
        f fVar3 = null;
        switch (this.f640a) {
            case 0:
                ua uaVar = (ua) this.f641b;
                a8 a8Var = a8.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                HashMap hashMap = uaVar.f675j;
                i iVar = (i) hashMap.get(a8Var);
                if (iVar != null) {
                    i iVar2 = iVar;
                    b bVar = iVar2.f462a;
                    if (bVar == null) {
                        i iVar3 = iVar2;
                        b bVar2 = new b(iVar3, iVar3.f486c);
                        iVar2.f462a = bVar2;
                        bVar = bVar2;
                    }
                    Iterator it = bVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) iVar.f486c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            fVar = new f(iVar, next, list, (f) null);
                        } else {
                            fVar = new f(iVar, next, list, (f) null);
                        }
                        ArrayList arrayList = new ArrayList(fVar);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        int size = arrayList.size();
                        long j10 = 0;
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            j10 = ((Long) obj4).longValue() + j10;
                        }
                        obj3.f514c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f512a = Long.valueOf(ua.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f516f = Long.valueOf(ua.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.f515e = Long.valueOf(ua.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(ua.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f513b = Long.valueOf(ua.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        l7 l7Var = new l7(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f343c = y7.TYPE_THIN;
                        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(2, false);
                        a0Var.f1725c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        a0Var.f1724b = (e1) next;
                        a0Var.d = l7Var;
                        obj5.f345f = new f1(a0Var);
                        pb.n.f55585a.execute(new qa(uaVar, new xa((b8) obj5, 0), a8Var, uaVar.b(), 0));
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.r(this);
                ai.p0 p0Var = (ai.p0) this.f641b;
                if (p0Var.f1405r == 1 && p0Var.f1407s != null) {
                    Editable text = p0Var.f1392f.f39573a.F0.getText();
                    if (text != null && text.toString().trim().length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (p0Var.f1407s.getRightMode() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j11 = p0Var.f1406r0;
                    if (uptimeMillis - j11 >= 300) {
                        if (!z11) {
                            if (z10 && uptimeMillis - p0Var.U > 1200 && uptimeMillis - p0Var.f1404q0 > 1200) {
                                p0Var.f1407s.setRightMode(2);
                                p0Var.f1406r0 = uptimeMillis;
                            }
                        } else if (!z10 || p0Var.U > j11) {
                            p0Var.f1407s.setRightMode(0);
                            p0Var.f1406r0 = uptimeMillis;
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 50L);
                    return;
                }
                return;
            case 2:
                ai.s0 s0Var = (ai.s0) this.f641b;
                s0Var.f1484j1 = false;
                if (s0Var.isAttachedToWindow() && s0Var.getVisibility() == 0) {
                    s0Var.invalidate();
                    s0Var.f1484j1 = true;
                    s0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ai.k2 k2Var = (ai.k2) this.f641b;
                TextView textView = k2Var.f1266a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    k2Var.f1271g = false;
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                ai.i2[] i2VarArr = (ai.i2[]) editableText.getSpans(0, editableText.length(), ai.i2.class);
                int length = i2VarArr.length;
                int i14 = 0;
                boolean z14 = false;
                while (i14 < length) {
                    ai.i2 i2Var = i2VarArr[i14];
                    int spanStart = editableText.getSpanStart(i2Var);
                    int spanEnd = editableText.getSpanEnd(i2Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        j3 = uptimeMillis2;
                        if (j3 < (Math.max(0, i2Var.f1244c - 1) * 22) + i2Var.f1242a + 320) {
                            editableText.setSpan(i2Var, spanStart, spanEnd, 33);
                            z14 = true;
                            i14++;
                            uptimeMillis2 = j3;
                        }
                    } else {
                        j3 = uptimeMillis2;
                    }
                    editableText.removeSpan(i2Var);
                    i14++;
                    uptimeMillis2 = j3;
                }
                long j12 = uptimeMillis2;
                ai.h2[] h2VarArr2 = (ai.h2[]) editableText.getSpans(0, editableText.length(), ai.h2.class);
                int length2 = h2VarArr2.length;
                boolean z15 = z14;
                int i15 = 0;
                while (i15 < length2) {
                    ai.h2 h2Var = h2VarArr2[i15];
                    int spanStart2 = editableText.getSpanStart(h2Var);
                    int spanEnd2 = editableText.getSpanEnd(h2Var);
                    if (spanStart2 < 0 || spanEnd2 <= spanStart2) {
                        h2VarArr = h2VarArr2;
                        i7 = length2;
                        i10 = i15;
                        editableText.removeSpan(h2Var);
                    } else if (p0.C((float) (j12 - h2Var.f1225a), 750.0f, 1.0f, 0.0f) >= 1.0f) {
                        editableText.removeSpan(h2Var);
                        h2VarArr = h2VarArr2;
                        i7 = length2;
                        i10 = i15;
                    } else {
                        long j13 = h2Var.f1226b;
                        if (j13 <= 0) {
                            j13 = h2Var.f1225a;
                        }
                        if (j12 >= j13 - 16) {
                            if (!h2Var.f1228e) {
                                h2Var.f1228e = true;
                                ai.a0 a0Var2 = k2Var.h;
                                if (a0Var2 != null) {
                                    ai.p0 p0Var2 = a0Var2.f1114b;
                                    float[] fArr = p0Var2.D0;
                                    org.telegram.ui.Components.d6 d6Var = p0Var2.Y;
                                    if (d6Var == null || d6Var.f34386c < 0.2f || !p0Var2.r(fArr) || (layout = p0Var2.f1392f.f39573a.F0.getLayout()) == null || spanEnd2 > layout.getText().length()) {
                                        h2VarArr = h2VarArr2;
                                        i7 = length2;
                                    } else {
                                        int lineForOffset = layout.getLineForOffset(spanStart2);
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                        if (layout.getLineForOffset(spanEnd2) == lineForOffset) {
                                            lineRight = layout.getPrimaryHorizontal(spanEnd2);
                                        } else {
                                            lineRight = layout.getLineRight(lineForOffset);
                                        }
                                        h2VarArr = h2VarArr2;
                                        ai.u0 u0Var = p0Var2.f1414x;
                                        float f10 = primaryHorizontal + fArr[0];
                                        i7 = length2;
                                        float lineTop = layout.getLineTop(lineForOffset) + fArr[1];
                                        float max = Math.max(primaryHorizontal, lineRight) + fArr[0];
                                        float lineBottom = layout.getLineBottom(lineForOffset) + fArr[1];
                                        int i16 = ((int) (p0Var2.Q * 2.5f)) + 2;
                                        Random random = u0Var.f1551t;
                                        float f11 = 0.5f;
                                        if (random.nextFloat() < 0.5f) {
                                            i11 = 1;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i17 = i16 + i11;
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            float nextFloat = random.nextFloat();
                                            float f12 = f11;
                                            ai.u0 u0Var2 = u0Var;
                                            float z16 = com.google.android.gms.internal.vision.e2.z(lineBottom, lineTop, org.telegram.ui.Cells.c0.h(random, 0.85f, 0.15f), lineTop);
                                            float L = org.telegram.messenger.g0.L((random.nextFloat() * 7.0f) + 3.0f);
                                            double nextFloat2 = ((random.nextFloat() - f12) * 2.2f) - 1.5707963267948966d;
                                            u0Var2.j((Math.max(1.0f, max - f10) * nextFloat) + f10, z16, ((float) Math.cos(nextFloat2)) * L, ((float) Math.sin(nextFloat2)) * L, org.telegram.ui.Cells.c0.h(random, 0.55f, 0.45f), org.telegram.ui.Cells.c0.h(random, f12, 0.55f));
                                            i18++;
                                            f11 = f12;
                                            u0Var = u0Var2;
                                            i15 = i15;
                                            lineTop = lineTop;
                                        }
                                    }
                                    i10 = i15;
                                    editableText.setSpan(h2Var, spanStart2, spanEnd2, 33);
                                }
                            }
                            h2VarArr = h2VarArr2;
                            i7 = length2;
                            i10 = i15;
                            editableText.setSpan(h2Var, spanStart2, spanEnd2, 33);
                        } else {
                            h2VarArr = h2VarArr2;
                            i7 = length2;
                            i10 = i15;
                        }
                        z15 = true;
                    }
                    i15 = i10 + 1;
                    h2VarArr2 = h2VarArr;
                    length2 = i7;
                }
                for (ai.g2 g2Var : (ai.g2[]) editableText.getSpans(0, editableText.length(), ai.g2.class)) {
                    if (g2Var.f1217a != 0) {
                        int spanStart3 = editableText.getSpanStart(g2Var);
                        int spanEnd3 = editableText.getSpanEnd(g2Var);
                        if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                            long j14 = g2Var.f1217a;
                            if (j14 == 0 || j12 < j14 + 300) {
                                editableText.setSpan(g2Var, spanStart3, spanEnd3, 33);
                                z15 = true;
                            }
                        }
                        editableText.removeSpan(g2Var);
                    }
                }
                ai.j2 j2Var = k2Var.f1273j;
                if (j2Var != null && k2Var.f1276m > 0.0f && editableText.getSpanStart(j2Var) >= 0) {
                    z12 = false;
                    editableText.setSpan(k2Var.f1273j, 0, editableText.length(), 18);
                    z13 = true;
                } else {
                    z12 = false;
                    z13 = z15;
                }
                if (z13) {
                    textView.postOnAnimation(this);
                    return;
                } else {
                    k2Var.f1271g = z12;
                    return;
                }
            case 4:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e10;
                } catch (NullPointerException e11) {
                    if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 5:
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f641b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                g0Var.D0.f(1);
                g0Var.D0.e(n10.getString(2131689608));
                return;
            case 6:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f641b;
                pVar.f2421o0.onDismiss(pVar.f2429w0);
                return;
            case 7:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f641b;
                if (sVar.Z != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 8:
                ((androidx.fragment.app.j0) this.f641b).A(true);
                return;
            case 9:
                synchronized (((androidx.lifecycle.z) this.f641b).f2574a) {
                    obj = ((androidx.lifecycle.z) this.f641b).f2578f;
                    ((androidx.lifecycle.z) this.f641b).f2578f = androidx.lifecycle.z.f2573k;
                }
                ((androidx.lifecycle.z) this.f641b).j(obj);
                return;
            case 10:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.f641b;
                tVar.i(true);
                tVar.V.requestLayout();
                tVar.V.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, 0));
                return;
            case 11:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.f641b).f2765b;
                if (tVar2.f2771d0 != null) {
                    tVar2.f2771d0 = null;
                    if (tVar2.f2789t0) {
                        tVar2.q(tVar2.f2790u0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((b3.n) this.f641b).d();
                return;
            case 13:
                for (Thread thread : bg.i.f3264w.keySet()) {
                    if (!thread.isAlive()) {
                        bg.i.f3264w.remove(thread);
                    }
                }
                if (!bg.i.f3264w.isEmpty()) {
                    org.telegram.messenger.g0.h3(((bg.i) this.f641b).f3281p, 5000L);
                    return;
                } else {
                    bg.i.f3265x = false;
                    return;
                }
            case 14:
                bg.c0 c0Var = (bg.c0) this.f641b;
                if (c0Var.G.get()) {
                    c0Var.invalidate();
                    c0Var.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 15:
                c5.l lVar = (c5.l) this.f641b;
                lVar.setScrollState(0);
                lVar.s();
                return;
            case 16:
                uf ufVar = (uf) this.f641b;
                c8.fb fbVar = c8.fb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = ufVar.f5041j;
                jg jgVar = (jg) hashMap2.get(fbVar);
                if (jgVar != null) {
                    jg jgVar2 = jgVar;
                    cd cdVar = jgVar2.f4862a;
                    if (cdVar == null) {
                        jg jgVar3 = jgVar2;
                        cd cdVar2 = new cd(jgVar3, jgVar3.f4881c);
                        jgVar2.f4862a = cdVar2;
                        cdVar = cdVar2;
                    }
                    Iterator it2 = cdVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj6 = (Collection) jgVar.f4881c.get(next2);
                        if (obj6 == null) {
                            obj6 = new ArrayList(i12);
                        }
                        List list2 = (List) obj6;
                        if (list2 instanceof RandomAccess) {
                            fVar2 = new f(jgVar, next2, list2, fVar3);
                        } else {
                            fVar2 = new f(jgVar, next2, list2, fVar3);
                        }
                        ArrayList arrayList2 = new ArrayList(fVar2);
                        Collections.sort(arrayList2);
                        ?? obj7 = new Object();
                        int size3 = arrayList2.size();
                        long j15 = 0;
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj8 = arrayList2.get(i19);
                            i19++;
                            j15 = ((Long) obj8).longValue() + j15;
                        }
                        jg jgVar4 = jgVar;
                        obj7.f514c = Long.valueOf((j15 / arrayList2.size()) & Long.MAX_VALUE);
                        obj7.f512a = Long.valueOf(uf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj7.f516f = Long.valueOf(uf.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        obj7.f515e = Long.valueOf(uf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj7.d = Long.valueOf(uf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj7.f513b = Long.valueOf(uf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        c8.la laVar = new c8.la(obj7);
                        int size4 = arrayList2.size();
                        ga.d dVar = new ga.d(1);
                        dVar.d = c8.db.TYPE_THIN;
                        android.support.v4.media.session.a0 a0Var3 = new android.support.v4.media.session.a0(15, false);
                        a0Var3.f1725c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        a0Var3.f1724b = (c8.h1) next2;
                        a0Var3.d = laVar;
                        dVar.f13313n = new c8.i1(a0Var3);
                        uf ufVar2 = ufVar;
                        c8.fb fbVar2 = fbVar;
                        pb.n.f55585a.execute(new qa(ufVar2, new xa(dVar, 0), fbVar2, ufVar.c(), 1));
                        fbVar = fbVar2;
                        ufVar = ufVar2;
                        jgVar = jgVar4;
                        fVar3 = null;
                        i12 = 3;
                    }
                    hashMap2.remove(fbVar);
                    return;
                }
                return;
            case 17:
                ci.b0 b0Var = (ci.b0) this.f641b;
                CameraView cameraView = b0Var.f5581b;
                if (b0Var.f5592i0 && cameraView != null) {
                    TextureView textureView = cameraView.getTextureView();
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    if (width > 0 && height > 0) {
                        if (width > 720 || height > 720) {
                            float f13 = width;
                            float f14 = height;
                            float min = Math.min(720.0f / f13, 720.0f / f14);
                            width = Math.max(1, (int) (f13 * min));
                            height = Math.max(1, (int) (f14 * min));
                        }
                        Bitmap bitmap = ((ci.b0) this.f641b).f5595l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((ci.b0) this.f641b).f5595l0.getHeight() != height) {
                            ((ci.b0) this.f641b).f5595l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((ci.b0) this.f641b).f5595l0);
                            ci.b0 b0Var2 = (ci.b0) this.f641b;
                            q4.q f15 = ci.b0.f(b0Var2.f5595l0, b0Var2.f5593j0, b0Var2.f5594k0, b0Var2.P);
                            if (f15 != null) {
                                org.telegram.messenger.g0.g3(new c1.a(13, this, f15));
                                return;
                            }
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                    }
                    if (((ci.b0) this.f641b).f5592i0) {
                        ((ci.b0) this.f641b).f5591h0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                com.google.android.gms.common.api.internal.c0 c0Var2 = (com.google.android.gms.common.api.internal.c0) this.f641b;
                n6.e eVar = c0Var2.d;
                Context context = c0Var2.f6269c;
                eVar.getClass();
                if (!n6.g.f21464a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e12) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e12);
                        return;
                    }
                }
                return;
            case 19:
                ((com.google.android.gms.common.api.internal.l0) this.f641b).a();
                return;
            case 20:
                com.google.android.gms.common.api.internal.l0 l0Var = (com.google.android.gms.common.api.internal.l0) ((ob.c) this.f641b).f21808b;
                ((q6.d) l0Var.f6348b).j(l0Var.f6348b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((com.google.android.gms.common.api.internal.x0) this.f641b).f6410j.b(new n6.a(4, null, null));
                return;
            case 22:
                com.google.android.gms.common.api.internal.h1 h1Var = (com.google.android.gms.common.api.internal.h1) this.f641b;
                h1Var.f6324o.lock();
                try {
                    h1Var.j();
                    return;
                } finally {
                    h1Var.f6324o.unlock();
                }
            case 23:
                f5.t tVar3 = (f5.t) this.f641b;
                f5.b bVar3 = tVar3.f11352e;
                bVar3.k(0);
                f5.f fVar4 = f5.z.f11364i;
                bVar3.j(24, tVar3.d, fVar4);
                tVar3.c(fVar4);
                return;
            case 24:
                fi.z3 z3Var = (fi.z3) this.f641b;
                if (z3Var.f12921u1 && z3Var.L0) {
                    fi.f9 f9Var = ((fi.w8) z3Var.A1).d;
                    f9Var.l1 = false;
                    f9Var.V();
                    return;
                }
                return;
            case 25:
                ((fi.w) this.f641b).M0 = false;
                return;
            case 26:
                fi.o7 o7Var = (fi.o7) this.f641b;
                o7Var.f12385b = false;
                o7Var.invalidate();
                return;
            case 27:
                tg.j jVar = ((hi.u9) this.f641b).f14904t0;
                if (jVar instanceof tg.n2) {
                    ((tg.n2) jVar).getEditText();
                    return;
                }
                return;
            case 28:
                i.e eVar2 = (i.e) this.f641b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            default:
                ((i6.h) this.f641b).g(false);
                return;
        }
    }

    public sa(Object obj, int i7) {
        this.f640a = i7;
        this.f641b = obj;
    }

    public sa(com.google.android.gms.common.api.internal.x0 x0Var) {
        this.f640a = 21;
        Objects.requireNonNull(x0Var);
        this.f641b = x0Var;
    }
}
