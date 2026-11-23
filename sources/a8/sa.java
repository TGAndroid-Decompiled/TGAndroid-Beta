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
    public final int f639a;
    public final Object f640b;

    public sa(uf ufVar) {
        this.f639a = 16;
        c8.fb fbVar = c8.fb.UNKNOWN_EVENT;
        this.f640b = ufVar;
    }

    @Override
    public final void run() {
        f fVar;
        boolean z10;
        boolean z11;
        ai.w1[] w1VarArr;
        boolean z12;
        boolean z13;
        ai.x1[] x1VarArr;
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
        switch (this.f639a) {
            case 0:
                ua uaVar = (ua) this.f640b;
                a8 a8Var = a8.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
                HashMap hashMap = uaVar.f674j;
                i iVar = (i) hashMap.get(a8Var);
                if (iVar != null) {
                    i iVar2 = iVar;
                    b bVar = iVar2.f456a;
                    if (bVar == null) {
                        i iVar3 = iVar2;
                        b bVar2 = new b(iVar3, iVar3.f486c);
                        iVar2.f456a = bVar2;
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
                        a0Var.f1676c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        a0Var.f1675b = (e1) next;
                        a0Var.d = l7Var;
                        obj5.f345f = new f1(a0Var);
                        pb.n.f55550a.execute(new qa(uaVar, new xa((b8) obj5, 0), a8Var, uaVar.b(), 0));
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.r(this);
                ai.k0 k0Var = (ai.k0) this.f640b;
                if (k0Var.f1335r == 1 && k0Var.f1337s != null) {
                    Editable text = k0Var.f1322f.f39132a.F0.getText();
                    if (text != null && text.toString().trim().length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (k0Var.f1337s.getRightMode() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j11 = k0Var.f1336r0;
                    if (uptimeMillis - j11 >= 300) {
                        if (!z11) {
                            if (z10 && uptimeMillis - k0Var.U > 1200 && uptimeMillis - k0Var.f1334q0 > 1200) {
                                k0Var.f1337s.setRightMode(2);
                                k0Var.f1336r0 = uptimeMillis;
                            }
                        } else if (!z10 || k0Var.U > j11) {
                            k0Var.f1337s.setRightMode(0);
                            k0Var.f1336r0 = uptimeMillis;
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 50L);
                    return;
                }
                return;
            case 2:
                ai.n0 n0Var = (ai.n0) this.f640b;
                n0Var.f1404j1 = false;
                if (n0Var.isAttachedToWindow() && n0Var.getVisibility() == 0) {
                    n0Var.invalidate();
                    n0Var.f1404j1 = true;
                    n0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ai.a2 a2Var = (ai.a2) this.f640b;
                TextView textView = a2Var.f1119a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    a2Var.f1124g = false;
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                ai.y1[] y1VarArr = (ai.y1[]) editableText.getSpans(0, editableText.length(), ai.y1.class);
                int length = y1VarArr.length;
                int i14 = 0;
                boolean z14 = false;
                while (i14 < length) {
                    ai.y1 y1Var = y1VarArr[i14];
                    int spanStart = editableText.getSpanStart(y1Var);
                    int spanEnd = editableText.getSpanEnd(y1Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        j3 = uptimeMillis2;
                        if (j3 < (Math.max(0, y1Var.f1598c - 1) * 22) + y1Var.f1596a + 320) {
                            editableText.setSpan(y1Var, spanStart, spanEnd, 33);
                            z14 = true;
                            i14++;
                            uptimeMillis2 = j3;
                        }
                    } else {
                        j3 = uptimeMillis2;
                    }
                    editableText.removeSpan(y1Var);
                    i14++;
                    uptimeMillis2 = j3;
                }
                long j12 = uptimeMillis2;
                ai.x1[] x1VarArr2 = (ai.x1[]) editableText.getSpans(0, editableText.length(), ai.x1.class);
                int length2 = x1VarArr2.length;
                boolean z15 = z14;
                int i15 = 0;
                while (i15 < length2) {
                    ai.x1 x1Var = x1VarArr2[i15];
                    int spanStart2 = editableText.getSpanStart(x1Var);
                    int spanEnd2 = editableText.getSpanEnd(x1Var);
                    if (spanStart2 < 0 || spanEnd2 <= spanStart2) {
                        x1VarArr = x1VarArr2;
                        i7 = length2;
                        i10 = i15;
                        editableText.removeSpan(x1Var);
                    } else if (p0.C((float) (j12 - x1Var.f1589a), 750.0f, 1.0f, 0.0f) >= 1.0f) {
                        editableText.removeSpan(x1Var);
                        x1VarArr = x1VarArr2;
                        i7 = length2;
                        i10 = i15;
                    } else {
                        long j13 = x1Var.f1590b;
                        if (j13 <= 0) {
                            j13 = x1Var.f1589a;
                        }
                        if (j12 >= j13 - 16) {
                            if (!x1Var.f1592e) {
                                x1Var.f1592e = true;
                                ai.v vVar = a2Var.h;
                                if (vVar != null) {
                                    ai.k0 k0Var2 = vVar.f1549b;
                                    float[] fArr = k0Var2.D0;
                                    org.telegram.ui.Components.d6 d6Var = k0Var2.Y;
                                    if (d6Var == null || d6Var.f34349c < 0.2f || !k0Var2.r(fArr) || (layout = k0Var2.f1322f.f39132a.F0.getLayout()) == null || spanEnd2 > layout.getText().length()) {
                                        x1VarArr = x1VarArr2;
                                        i7 = length2;
                                    } else {
                                        int lineForOffset = layout.getLineForOffset(spanStart2);
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                        if (layout.getLineForOffset(spanEnd2) == lineForOffset) {
                                            lineRight = layout.getPrimaryHorizontal(spanEnd2);
                                        } else {
                                            lineRight = layout.getLineRight(lineForOffset);
                                        }
                                        x1VarArr = x1VarArr2;
                                        ai.p0 p0Var = k0Var2.f1344x;
                                        float f10 = primaryHorizontal + fArr[0];
                                        i7 = length2;
                                        float lineTop = layout.getLineTop(lineForOffset) + fArr[1];
                                        float max = Math.max(primaryHorizontal, lineRight) + fArr[0];
                                        float lineBottom = layout.getLineBottom(lineForOffset) + fArr[1];
                                        int i16 = ((int) (k0Var2.Q * 2.5f)) + 2;
                                        Random random = p0Var.f1469t;
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
                                            ai.p0 p0Var2 = p0Var;
                                            float z16 = com.google.android.gms.internal.vision.e2.z(lineBottom, lineTop, org.telegram.ui.Cells.c0.h(random, 0.85f, 0.15f), lineTop);
                                            float L = org.telegram.messenger.g0.L((random.nextFloat() * 7.0f) + 3.0f);
                                            double nextFloat2 = ((random.nextFloat() - f12) * 2.2f) - 1.5707963267948966d;
                                            p0Var2.j((Math.max(1.0f, max - f10) * nextFloat) + f10, z16, ((float) Math.cos(nextFloat2)) * L, ((float) Math.sin(nextFloat2)) * L, org.telegram.ui.Cells.c0.h(random, 0.55f, 0.45f), org.telegram.ui.Cells.c0.h(random, f12, 0.55f));
                                            i18++;
                                            f11 = f12;
                                            p0Var = p0Var2;
                                            i15 = i15;
                                            lineTop = lineTop;
                                        }
                                    }
                                    i10 = i15;
                                    editableText.setSpan(x1Var, spanStart2, spanEnd2, 33);
                                }
                            }
                            x1VarArr = x1VarArr2;
                            i7 = length2;
                            i10 = i15;
                            editableText.setSpan(x1Var, spanStart2, spanEnd2, 33);
                        } else {
                            x1VarArr = x1VarArr2;
                            i7 = length2;
                            i10 = i15;
                        }
                        z15 = true;
                    }
                    i15 = i10 + 1;
                    x1VarArr2 = x1VarArr;
                    length2 = i7;
                }
                for (ai.w1 w1Var : (ai.w1[]) editableText.getSpans(0, editableText.length(), ai.w1.class)) {
                    if (w1Var.f1581a != 0) {
                        int spanStart3 = editableText.getSpanStart(w1Var);
                        int spanEnd3 = editableText.getSpanEnd(w1Var);
                        if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                            long j14 = w1Var.f1581a;
                            if (j14 == 0 || j12 < j14 + 300) {
                                editableText.setSpan(w1Var, spanStart3, spanEnd3, 33);
                                z15 = true;
                            }
                        }
                        editableText.removeSpan(w1Var);
                    }
                }
                ai.z1 z1Var = a2Var.f1126j;
                if (z1Var != null && a2Var.f1129m > 0.0f && editableText.getSpanStart(z1Var) >= 0) {
                    z12 = false;
                    editableText.setSpan(a2Var.f1126j, 0, editableText.length(), 18);
                    z13 = true;
                } else {
                    z12 = false;
                    z13 = z15;
                }
                if (z13) {
                    textView.postOnAnimation(this);
                    return;
                } else {
                    a2Var.f1124g = z12;
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
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f640b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                g0Var.D0.f(1);
                g0Var.D0.e(n10.getString(2131689608));
                return;
            case 6:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f640b;
                pVar.f2372o0.onDismiss(pVar.f2380w0);
                return;
            case 7:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f640b;
                if (sVar.Z != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 8:
                ((androidx.fragment.app.j0) this.f640b).A(true);
                return;
            case 9:
                synchronized (((androidx.lifecycle.z) this.f640b).f2525a) {
                    obj = ((androidx.lifecycle.z) this.f640b).f2529f;
                    ((androidx.lifecycle.z) this.f640b).f2529f = androidx.lifecycle.z.f2524k;
                }
                ((androidx.lifecycle.z) this.f640b).j(obj);
                return;
            case 10:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.f640b;
                tVar.i(true);
                tVar.V.requestLayout();
                tVar.V.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, 0));
                return;
            case 11:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.f640b).f2716b;
                if (tVar2.f2722d0 != null) {
                    tVar2.f2722d0 = null;
                    if (tVar2.f2740t0) {
                        tVar2.q(tVar2.f2741u0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((b3.n) this.f640b).d();
                return;
            case 13:
                for (Thread thread : bg.i.f3215w.keySet()) {
                    if (!thread.isAlive()) {
                        bg.i.f3215w.remove(thread);
                    }
                }
                if (!bg.i.f3215w.isEmpty()) {
                    org.telegram.messenger.g0.h3(((bg.i) this.f640b).f3232p, 5000L);
                    return;
                } else {
                    bg.i.f3216x = false;
                    return;
                }
            case 14:
                bg.c0 c0Var = (bg.c0) this.f640b;
                if (c0Var.G.get()) {
                    c0Var.invalidate();
                    c0Var.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 15:
                c5.l lVar = (c5.l) this.f640b;
                lVar.setScrollState(0);
                lVar.s();
                return;
            case 16:
                uf ufVar = (uf) this.f640b;
                c8.fb fbVar = c8.fb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                HashMap hashMap2 = ufVar.f5006j;
                jg jgVar = (jg) hashMap2.get(fbVar);
                if (jgVar != null) {
                    jg jgVar2 = jgVar;
                    cd cdVar = jgVar2.f4826a;
                    if (cdVar == null) {
                        jg jgVar3 = jgVar2;
                        cd cdVar2 = new cd(jgVar3, jgVar3.f4842c);
                        jgVar2.f4826a = cdVar2;
                        cdVar = cdVar2;
                    }
                    Iterator it2 = cdVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj6 = (Collection) jgVar.f4842c.get(next2);
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
                        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(15, false);
                        a0Var2.f1676c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        a0Var2.f1675b = (c8.h1) next2;
                        a0Var2.d = laVar;
                        dVar.f13276n = new c8.i1(a0Var2);
                        uf ufVar2 = ufVar;
                        c8.fb fbVar2 = fbVar;
                        pb.n.f55550a.execute(new qa(ufVar2, new xa(dVar, 0), fbVar2, ufVar.c(), 1));
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
                ci.b0 b0Var = (ci.b0) this.f640b;
                CameraView cameraView = b0Var.f5544b;
                if (b0Var.f5555i0 && cameraView != null) {
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
                        Bitmap bitmap = ((ci.b0) this.f640b).f5558l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((ci.b0) this.f640b).f5558l0.getHeight() != height) {
                            ((ci.b0) this.f640b).f5558l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((ci.b0) this.f640b).f5558l0);
                            ci.b0 b0Var2 = (ci.b0) this.f640b;
                            q4.q f15 = ci.b0.f(b0Var2.f5558l0, b0Var2.f5556j0, b0Var2.f5557k0, b0Var2.P);
                            if (f15 != null) {
                                org.telegram.messenger.g0.g3(new c1.c(11, this, f15));
                                return;
                            }
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                    }
                    if (((ci.b0) this.f640b).f5555i0) {
                        ((ci.b0) this.f640b).f5554h0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                com.google.android.gms.common.api.internal.c0 c0Var2 = (com.google.android.gms.common.api.internal.c0) this.f640b;
                n6.e eVar = c0Var2.d;
                Context context = c0Var2.f6232c;
                eVar.getClass();
                if (!n6.g.f21430a.getAndSet(true)) {
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
                ((com.google.android.gms.common.api.internal.l0) this.f640b).a();
                return;
            case 20:
                com.google.android.gms.common.api.internal.l0 l0Var = (com.google.android.gms.common.api.internal.l0) ((ob.c) this.f640b).f21774b;
                ((q6.d) l0Var.f6311b).j(l0Var.f6311b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((com.google.android.gms.common.api.internal.x0) this.f640b).f6373j.b(new n6.a(4, null, null));
                return;
            case 22:
                com.google.android.gms.common.api.internal.h1 h1Var = (com.google.android.gms.common.api.internal.h1) this.f640b;
                h1Var.f6287o.lock();
                try {
                    h1Var.j();
                    return;
                } finally {
                    h1Var.f6287o.unlock();
                }
            case 23:
                f5.t tVar3 = (f5.t) this.f640b;
                f5.b bVar3 = tVar3.f11315e;
                bVar3.k(0);
                f5.f fVar4 = f5.z.f11327i;
                bVar3.j(24, tVar3.d, fVar4);
                tVar3.c(fVar4);
                return;
            case 24:
                fi.z3 z3Var = (fi.z3) this.f640b;
                if (z3Var.f12872u1 && z3Var.L0) {
                    fi.f9 f9Var = ((fi.w8) z3Var.A1).d;
                    f9Var.l1 = false;
                    f9Var.V();
                    return;
                }
                return;
            case 25:
                ((fi.w) this.f640b).M0 = false;
                return;
            case 26:
                fi.o7 o7Var = (fi.o7) this.f640b;
                o7Var.f12335b = false;
                o7Var.invalidate();
                return;
            case 27:
                tg.j jVar = ((hi.v9) this.f640b).f14916t0;
                if (jVar instanceof tg.n2) {
                    ((tg.n2) jVar).getEditText();
                    return;
                }
                return;
            case 28:
                i.e eVar2 = (i.e) this.f640b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            default:
                ((i6.h) this.f640b).g(false);
                return;
        }
    }

    public sa(Object obj, int i7) {
        this.f639a = i7;
        this.f640b = obj;
    }

    public sa(com.google.android.gms.common.api.internal.x0 x0Var) {
        this.f639a = 21;
        Objects.requireNonNull(x0Var);
        this.f640b = x0Var;
    }
}
