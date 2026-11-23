package a8;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
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
        ai.x1[] x1VarArr;
        boolean z11;
        boolean z12;
        ai.y1[] y1VarArr;
        int i7;
        int i10;
        Layout layout;
        float lineRight;
        int i11;
        boolean z13;
        TextView textView;
        int i12;
        Object obj;
        f fVar2;
        int i13;
        char c10;
        float hypot;
        Layout.Alignment alignment;
        float f10;
        float f11;
        double d = 75.0d;
        double d2 = 100.0d;
        int i14 = 3;
        int i15 = 2;
        float f12 = 0.0f;
        boolean z14 = true;
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
                        long j3 = 0;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            j3 = ((Long) obj4).longValue() + j3;
                        }
                        obj3.f514c = Long.valueOf((j3 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f512a = Long.valueOf(ua.a(arrayList, d2) & Long.MAX_VALUE);
                        obj3.f516f = Long.valueOf(ua.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.f515e = Long.valueOf(ua.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.d = Long.valueOf(ua.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f513b = Long.valueOf(ua.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        l7 l7Var = new l7(obj3);
                        int size2 = arrayList.size();
                        ?? obj5 = new Object();
                        obj5.f343c = y7.TYPE_THIN;
                        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(2, false);
                        a0Var.f1677c = Integer.valueOf(size2 & Integer.MAX_VALUE);
                        a0Var.f1676b = (e1) next;
                        a0Var.d = l7Var;
                        obj5.f345f = new f1(a0Var);
                        pb.n.f55663a.execute(new qa(uaVar, new xa((b8) obj5, 0), a8Var, uaVar.b(), 0));
                        d2 = 100.0d;
                    }
                    hashMap.remove(a8Var);
                    return;
                }
                return;
            case 1:
                boolean z15 = true;
                org.telegram.messenger.g0.r(this);
                ai.l0 l0Var = (ai.l0) this.f640b;
                if (l0Var.f1350r == 1 && l0Var.f1352s != null) {
                    Editable text = l0Var.f1337f.f39289a.F0.getText();
                    if (text != null && text.toString().trim().length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (l0Var.f1352s.getRightMode() != 2) {
                        z15 = false;
                    }
                    long j10 = l0Var.f1351r0;
                    if (uptimeMillis - j10 >= 300) {
                        if (!z15) {
                            if (z10 && uptimeMillis - l0Var.U > 1200 && uptimeMillis - l0Var.f1349q0 > 1200) {
                                l0Var.f1352s.setRightMode(2);
                                l0Var.f1351r0 = uptimeMillis;
                            }
                        } else if (!z10 || l0Var.U > j10) {
                            l0Var.f1352s.setRightMode(0);
                            l0Var.f1351r0 = uptimeMillis;
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 50L);
                    return;
                }
                return;
            case 2:
                ai.o0 o0Var = (ai.o0) this.f640b;
                o0Var.f1418j1 = false;
                if (o0Var.isAttachedToWindow() && o0Var.getVisibility() == 0) {
                    o0Var.invalidate();
                    o0Var.f1418j1 = true;
                    o0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ai.b2 b2Var = (ai.b2) this.f640b;
                TextView textView2 = b2Var.f1130a;
                Editable editableText = textView2.getEditableText();
                if (editableText == null) {
                    b2Var.f1135g = false;
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                ai.z1[] z1VarArr = (ai.z1[]) editableText.getSpans(0, editableText.length(), ai.z1.class);
                int length = z1VarArr.length;
                int i17 = 0;
                boolean z16 = false;
                while (i17 < length) {
                    ai.z1 z1Var = z1VarArr[i17];
                    int spanStart = editableText.getSpanStart(z1Var);
                    int spanEnd = editableText.getSpanEnd(z1Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        z13 = z14;
                        textView = textView2;
                        i12 = i15;
                        if (uptimeMillis2 < (Math.max(0, z1Var.f1610c - 1) * 22) + z1Var.f1608a + 320) {
                            editableText.setSpan(z1Var, spanStart, spanEnd, 33);
                            z16 = z13;
                            i17++;
                            textView2 = textView;
                            z14 = z13;
                            i15 = i12;
                        }
                    } else {
                        z13 = z14;
                        textView = textView2;
                        i12 = i15;
                    }
                    editableText.removeSpan(z1Var);
                    i17++;
                    textView2 = textView;
                    z14 = z13;
                    i15 = i12;
                }
                boolean z17 = z14;
                TextView textView3 = textView2;
                ai.y1[] y1VarArr2 = (ai.y1[]) editableText.getSpans(0, editableText.length(), ai.y1.class);
                int length2 = y1VarArr2.length;
                int i18 = 0;
                while (i18 < length2) {
                    ai.y1 y1Var = y1VarArr2[i18];
                    int spanStart2 = editableText.getSpanStart(y1Var);
                    int spanEnd2 = editableText.getSpanEnd(y1Var);
                    if (spanStart2 < 0 || spanEnd2 <= spanStart2) {
                        y1VarArr = y1VarArr2;
                        i7 = length2;
                        i10 = i18;
                        editableText.removeSpan(y1Var);
                    } else if (p0.C((float) (uptimeMillis2 - y1Var.f1601a), 750.0f, 1.0f, f12) >= 1.0f) {
                        editableText.removeSpan(y1Var);
                        y1VarArr = y1VarArr2;
                        i7 = length2;
                        i10 = i18;
                    } else {
                        long j11 = y1Var.f1602b;
                        if (j11 <= 0) {
                            j11 = y1Var.f1601a;
                        }
                        if (uptimeMillis2 >= j11 - 16) {
                            if (!y1Var.f1604e) {
                                y1Var.f1604e = z17;
                                ai.w wVar = b2Var.h;
                                if (wVar != null) {
                                    ai.l0 l0Var2 = wVar.f1561b;
                                    float[] fArr = l0Var2.D0;
                                    org.telegram.ui.Components.c6 c6Var = l0Var2.Y;
                                    if (c6Var != null && c6Var.f33931c >= 0.2f && l0Var2.p(fArr) && (layout = l0Var2.f1337f.f39289a.F0.getLayout()) != null && spanEnd2 <= layout.getText().length()) {
                                        int lineForOffset = layout.getLineForOffset(spanStart2);
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                        y1VarArr = y1VarArr2;
                                        if (layout.getLineForOffset(spanEnd2) == lineForOffset) {
                                            lineRight = layout.getPrimaryHorizontal(spanEnd2);
                                        } else {
                                            lineRight = layout.getLineRight(lineForOffset);
                                        }
                                        i7 = length2;
                                        ai.q0 q0Var = l0Var2.f1359x;
                                        float f13 = primaryHorizontal + fArr[0];
                                        i10 = i18;
                                        float lineTop = layout.getLineTop(lineForOffset) + fArr[1];
                                        float max = Math.max(primaryHorizontal, lineRight) + fArr[0];
                                        float lineBottom = layout.getLineBottom(lineForOffset) + fArr[1];
                                        int i19 = ((int) (l0Var2.Q * 2.5f)) + 2;
                                        Random random = q0Var.f1481t;
                                        float f14 = 0.5f;
                                        if (random.nextFloat() < 0.5f) {
                                            i11 = 1;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i20 = i19 + i11;
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            float f15 = f14;
                                            float f16 = max;
                                            float max2 = (Math.max(1.0f, max - f13) * random.nextFloat()) + f13;
                                            float z18 = com.google.android.gms.internal.vision.e2.z(lineBottom, lineTop, org.telegram.ui.Cells.c0.h(random, 0.85f, 0.15f), lineTop);
                                            float L = org.telegram.messenger.g0.L((random.nextFloat() * 7.0f) + 3.0f);
                                            ai.q0 q0Var2 = q0Var;
                                            double nextFloat = ((random.nextFloat() - f15) * 2.2f) - 1.5707963267948966d;
                                            q0Var2.j(max2, z18, ((float) Math.cos(nextFloat)) * L, ((float) Math.sin(nextFloat)) * L, org.telegram.ui.Cells.c0.h(random, 0.55f, 0.45f), org.telegram.ui.Cells.c0.h(random, f15, 0.55f));
                                            i21++;
                                            f14 = f15;
                                            q0Var = q0Var2;
                                            max = f16;
                                        }
                                        editableText.setSpan(y1Var, spanStart2, spanEnd2, 33);
                                    }
                                }
                            }
                            y1VarArr = y1VarArr2;
                            i7 = length2;
                            i10 = i18;
                            editableText.setSpan(y1Var, spanStart2, spanEnd2, 33);
                        } else {
                            y1VarArr = y1VarArr2;
                            i7 = length2;
                            i10 = i18;
                        }
                        z16 = true;
                    }
                    i18 = i10 + 1;
                    y1VarArr2 = y1VarArr;
                    length2 = i7;
                    z17 = true;
                    f12 = 0.0f;
                }
                for (ai.x1 x1Var : (ai.x1[]) editableText.getSpans(0, editableText.length(), ai.x1.class)) {
                    if (x1Var.f1593a != 0) {
                        int spanStart3 = editableText.getSpanStart(x1Var);
                        int spanEnd3 = editableText.getSpanEnd(x1Var);
                        if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                            long j12 = x1Var.f1593a;
                            if (j12 == 0 || uptimeMillis2 < j12 + 300) {
                                editableText.setSpan(x1Var, spanStart3, spanEnd3, 33);
                                z16 = true;
                            }
                        }
                        editableText.removeSpan(x1Var);
                    }
                }
                ai.a2 a2Var = b2Var.f1137j;
                if (a2Var != null && b2Var.f1140m > 0.0f && editableText.getSpanStart(a2Var) >= 0) {
                    z11 = false;
                    editableText.setSpan(b2Var.f1137j, 0, editableText.length(), 18);
                    z12 = true;
                } else {
                    z11 = false;
                    z12 = z16;
                }
                if (z12) {
                    textView3.postOnAnimation(this);
                    return;
                } else {
                    b2Var.f1135g = z11;
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
                pVar.f2373o0.onDismiss(pVar.f2381w0);
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
                synchronized (((androidx.lifecycle.z) this.f640b).f2526a) {
                    obj = ((androidx.lifecycle.z) this.f640b).f2530f;
                    ((androidx.lifecycle.z) this.f640b).f2530f = androidx.lifecycle.z.f2525k;
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
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.f640b).f2717b;
                if (tVar2.f2723d0 != null) {
                    tVar2.f2723d0 = null;
                    if (tVar2.f2741t0) {
                        tVar2.q(tVar2.f2742u0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((b3.n) this.f640b).e();
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
                            obj6 = new ArrayList(i14);
                        }
                        List list2 = (List) obj6;
                        if (list2 instanceof RandomAccess) {
                            fVar2 = new f(jgVar, next2, list2, (f) null);
                        } else {
                            fVar2 = new f(jgVar, next2, list2, (f) null);
                        }
                        ArrayList arrayList2 = new ArrayList(fVar2);
                        Collections.sort(arrayList2);
                        ?? obj7 = new Object();
                        int size3 = arrayList2.size();
                        long j13 = 0;
                        int i22 = 0;
                        while (i22 < size3) {
                            Object obj8 = arrayList2.get(i22);
                            i22++;
                            j13 = ((Long) obj8).longValue() + j13;
                        }
                        obj7.f514c = Long.valueOf((j13 / arrayList2.size()) & Long.MAX_VALUE);
                        obj7.f512a = Long.valueOf(uf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        obj7.f516f = Long.valueOf(uf.a(arrayList2, d) & Long.MAX_VALUE);
                        obj7.f515e = Long.valueOf(uf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        obj7.d = Long.valueOf(uf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        obj7.f513b = Long.valueOf(uf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        c8.la laVar = new c8.la(obj7);
                        int size4 = arrayList2.size();
                        ?? obj9 = new Object();
                        obj9.f13272c = c8.db.TYPE_THIN;
                        android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(15, false);
                        a0Var2.f1677c = Integer.valueOf(size4 & Integer.MAX_VALUE);
                        a0Var2.f1676b = (c8.h1) next2;
                        a0Var2.d = laVar;
                        obj9.h = new c8.i1(a0Var2);
                        uf ufVar2 = ufVar;
                        c8.fb fbVar2 = fbVar;
                        pb.n.f55663a.execute(new qa(ufVar2, new xa((ga.d) obj9, 0), fbVar2, ufVar.c(), 1));
                        fbVar = fbVar2;
                        ufVar = ufVar2;
                        d = 75.0d;
                        i14 = 3;
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
                            float f17 = width;
                            float f18 = height;
                            float min = Math.min(720.0f / f17, 720.0f / f18);
                            width = Math.max(1, (int) (f17 * min));
                            height = Math.max(1, (int) (f18 * min));
                        }
                        Bitmap bitmap = ((ci.b0) this.f640b).f5558l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((ci.b0) this.f640b).f5558l0.getHeight() != height) {
                            ((ci.b0) this.f640b).f5558l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((ci.b0) this.f640b).f5558l0);
                            ci.b0 b0Var2 = (ci.b0) this.f640b;
                            q4.q f19 = ci.b0.f(b0Var2.f5558l0, b0Var2.f5556j0, b0Var2.f5557k0, b0Var2.P);
                            if (f19 != null) {
                                org.telegram.messenger.g0.g3(new c1.a(13, this, f19));
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
                Context context = c0Var2.f6231c;
                eVar.getClass();
                if (!n6.g.f21529a.getAndSet(true)) {
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
                ((com.google.android.gms.common.api.internal.k0) this.f640b).a();
                return;
            case 20:
                com.google.android.gms.common.api.internal.k0 k0Var = (com.google.android.gms.common.api.internal.k0) ((ob.c) this.f640b).f21874b;
                ((q6.d) k0Var.f6307b).j(k0Var.f6307b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((com.google.android.gms.common.api.internal.w0) this.f640b).f6366j.b(new n6.a(4, null, null));
                return;
            case 22:
                com.google.android.gms.common.api.internal.g1 g1Var = (com.google.android.gms.common.api.internal.g1) this.f640b;
                g1Var.f6283o.lock();
                try {
                    g1Var.j();
                    return;
                } finally {
                    g1Var.f6283o.unlock();
                }
            case 23:
                f5.t tVar3 = (f5.t) this.f640b;
                f5.b bVar3 = tVar3.f11314e;
                bVar3.k(0);
                f5.f fVar3 = f5.z.f11326i;
                bVar3.j(24, tVar3.d, fVar3);
                tVar3.c(fVar3);
                return;
            case 24:
                fi.z3 z3Var = (fi.z3) this.f640b;
                if (z3Var.f12883u1 && z3Var.L0) {
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
                o7Var.f12347b = false;
                o7Var.invalidate();
                return;
            case 27:
                hi.a0 a0Var3 = (hi.a0) this.f640b;
                tg.d dVar = a0Var3.f14172f;
                if (dVar != null && a0Var3.f14171e != null) {
                    float[] fArr2 = a0Var3.h;
                    float[] fArr3 = a0Var3.f14173g;
                    float width2 = dVar.getWidth();
                    float height2 = dVar.getHeight();
                    float f20 = Float.MAX_VALUE;
                    float f21 = -3.4028235E38f;
                    int i23 = 0;
                    while (i23 < 4) {
                        if (i23 % 2 == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = width2;
                        }
                        int i24 = i15;
                        if (i23 < i15) {
                            f11 = 0.0f;
                        } else {
                            f11 = height2;
                        }
                        a0Var3.d(dVar, f10, f11);
                        f20 = Math.min(f20, fArr3[1]);
                        f21 = Math.max(f21, fArr3[1]);
                        i23++;
                        i15 = i24;
                    }
                    int i25 = i15;
                    float f22 = width2 / 2.0f;
                    float f23 = height2 / 2.0f;
                    float d10 = a0Var3.d(dVar, f22, f23);
                    float f24 = fArr3[1];
                    float d11 = a0Var3.d(dVar, width2, f23) - d10;
                    float f25 = fArr3[1] - f24;
                    if (width2 <= 0.0f) {
                        i13 = i25;
                        c10 = 0;
                        hypot = 1.0f;
                    } else {
                        i13 = i25;
                        c10 = 0;
                        hypot = ((float) Math.hypot(d11, f25)) / f22;
                    }
                    hi.a0.g(dVar, fArr2);
                    hi.u uVar = a0Var3.f14171e;
                    float degrees = (float) Math.toDegrees(Math.atan2(f25, d11));
                    TextPaint paint = dVar.getEditText().getPaint();
                    int currentTextColor = dVar.getEditText().getCurrentTextColor();
                    float f26 = fArr2[c10];
                    float f27 = fArr2[1];
                    float f28 = fArr2[i13];
                    if (dVar.getEditText().getLayout() != null) {
                        alignment = dVar.getEditText().getLayout().getAlignment();
                    } else {
                        alignment = null;
                    }
                    uVar.d(d10, f24, f20, f21, degrees, hypot, paint, currentTextColor, f26, f27, f28, alignment);
                    if (dVar.getParent() == null) {
                        a0Var3.f14171e.e(null, null);
                    } else {
                        a0Var3.f14171e.e(dVar.x(-1), dVar.x(1));
                    }
                    a0Var3.f14171e.postOnAnimation(this);
                    return;
                }
                return;
            case 28:
                tg.n nVar = ((hi.pa) this.f640b).f15590t0;
                if (nVar instanceof tg.q2) {
                    ((tg.q2) nVar).getEditText();
                    return;
                }
                return;
            default:
                i.e eVar2 = (i.e) this.f640b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
        }
    }

    public sa(Object obj, int i7) {
        this.f639a = i7;
        this.f640b = obj;
    }

    public sa(com.google.android.gms.common.api.internal.w0 w0Var) {
        this.f639a = 21;
        Objects.requireNonNull(w0Var);
        this.f640b = w0Var;
    }
}
