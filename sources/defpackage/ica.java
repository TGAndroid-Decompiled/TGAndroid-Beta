package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.c0;
import org.telegram.ui.Components.u;
public final class ica implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ica(int i, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        byte b = this.a;
        boolean z4 = true;
        int i2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ij.c0(i2, (TLRPC.TL_error) obj2, ((nfa) obj3).y1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 1:
                kea keaVar = (kea) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                String str = (String) obj;
                nfa nfaVar = keaVar.w;
                if (keaVar.h != 0) {
                    if (i2 == keaVar.n) {
                        int b2 = keaVar.b();
                        keaVar.f = arrayList;
                        keaVar.s--;
                        int b3 = keaVar.b();
                        if (keaVar.s == 0 || b3 != 0) {
                            nfaVar.z1(false);
                        }
                        int i3 = 0;
                        while (true) {
                            iea[] ieaVarArr = nfaVar.n0;
                            if (i3 < ieaVarArr.length) {
                                iea ieaVar = ieaVarArr[i3];
                                if (ieaVar.F == keaVar.r) {
                                    if (keaVar.s == 0 && b3 == 0) {
                                        ieaVar.w.d.setText(k96.a0("NoResultFoundFor", null, 2131747974, str));
                                        ieaVarArr[i3].w.f.setVisibility(8);
                                        ieaVarArr[i3].w.e(false, true);
                                    } else if (b2 == 0) {
                                        nfaVar.i(ieaVar.h, 0, null);
                                    }
                                }
                                i3++;
                            } else {
                                keaVar.f();
                            }
                        }
                    }
                    keaVar.h = 0;
                    return;
                }
                return;
            case 2:
                int i4 = this.b;
                vqa vqaVar = new vqa((Context) obj3, i4, y6c.h(i4).e(), (wjb) obj2, null);
                vqaVar.n2((TL_stars.SavedStarGift) obj, null);
                vqaVar.show();
                return;
            case 3:
                mza mzaVar = (mza) obj3;
                mzaVar.l((Bitmap) obj2, this.b, mzaVar.U, mzaVar.V, (r68) obj);
                return;
            case 4:
                y1b y1bVar = (y1b) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = y1bVar.k;
                int i5 = y1bVar.f;
                AbstractSet abstractSet2 = y1bVar.l;
                y1bVar.A = -1;
                StringBuilder sb = new StringBuilder("StoriesList ");
                byte b4 = y1bVar.e;
                sb.append((int) b4);
                sb.append("{");
                long j = y1bVar.d;
                sb.append(j);
                sb.append("} loaded {");
                sb.append(g2b.k0(arrayList2));
                de9.s("}", sb);
                ArrayList arrayList3 = y1bVar.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i6 = y1bVar.c;
                na7.q1(i6).b4(tL_stories_stories.users, false);
                na7.q1(i6).V3(tL_stories_stories.chats, false);
                ad7.Y(i6).j1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                y1bVar.u = false;
                y1bVar.s = tL_stories_stories.count;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    y1bVar.t((k27) arrayList2.get(i7), false);
                }
                if (abstractSet2.size() >= y1bVar.s) {
                    z = true;
                } else {
                    z = false;
                }
                y1bVar.r = z;
                if (!z) {
                    if (i5 <= 0) {
                        if (i2 == -1) {
                            if (!abstractSet2.isEmpty()) {
                                ArrayList arrayList4 = new ArrayList(abstractSet2);
                                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                                    Integer num = (Integer) arrayList4.get(i8);
                                    int intValue = num.intValue();
                                    if (!arrayList3.contains(num)) {
                                        i2 = intValue;
                                    }
                                }
                            }
                            i2 = -1;
                        }
                        int n = y1bVar.n();
                        Iterator it = abstractSet.iterator();
                        while (it.hasNext()) {
                            Integer num2 = (Integer) it.next();
                            int intValue2 = num2.intValue();
                            if (!abstractSet2.contains(num2) && intValue2 >= i2 && intValue2 <= n) {
                                it.remove();
                                y1bVar.u(intValue2, false);
                            }
                        }
                    }
                } else {
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3)) {
                            it2.remove();
                            y1bVar.u(intValue3, false);
                        }
                    }
                }
                y1bVar.d(true);
                if (y1bVar.r) {
                    HashMap hashMap = y1b.B;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        y1b.B = hashMap;
                    }
                    hashMap.put(Integer.valueOf(Objects.hash(Integer.valueOf(i6), Integer.valueOf(b4), Long.valueOf(j), Integer.valueOf(i5))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    y1bVar.w();
                }
                y1bVar.x();
                return;
            case 5:
                dbb dbbVar = (dbb) obj3;
                String[] strArr = (String[]) obj2;
                String str2 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i9 = dbbVar.a;
                hq6 d0 = hq6.d0(i9);
                gg ggVar = new gg(dbbVar, this.b, str2, hashSet, arrayList5);
                if (gba.E && y6c.h(i9).p()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d0.W(strArr, str2, true, ggVar, z2);
                return;
            case 6:
                dbb dbbVar2 = (dbb) obj3;
                String str3 = (String) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (i2 == dbbVar2.L) {
                    dbbVar2.K = str3;
                    dbbVar2.J = (byte) 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (!arrayList6.isEmpty()) {
                        dbbVar2.y = false;
                        dbbVar2.w = false;
                        dbbVar2.b();
                        zab zabVar = dbbVar2.d;
                        if (zabVar != null) {
                            zabVar.setVisibility(0);
                            dbbVar2.d.invalidate();
                        }
                        dbbVar2.x = arrayList6;
                        s20 s20Var = dbbVar2.f;
                        if (s20Var != null) {
                            s20Var.f();
                            return;
                        }
                        return;
                    }
                    dbbVar2.y = true;
                    dbbVar2.e();
                    return;
                }
                return;
            case 7:
                b1 b1Var = (b1) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                d97 d97Var = (d97) obj;
                if (i2 != bkb.vm) {
                    b1Var.run();
                    return;
                }
                bkb.jm = sparseIntArray;
                d97Var.run();
                return;
            case 8:
                c0 c0Var = (c0) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = c0Var.r;
                u uVar = editorAlert.m1;
                if (i2 == c0Var.d) {
                    c0 c0Var2 = editorAlert.s1;
                    if (uVar.getAdapter() != c0Var2) {
                        editorAlert.z1 = editorAlert.D0();
                        uVar.setAdapter(c0Var2);
                        c0Var2.f();
                    }
                    if (!c0Var.e.isEmpty() && arrayList7.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = (c0Var.e.isEmpty() && arrayList7.isEmpty()) ? false : false;
                    if (z3) {
                        editorAlert.z1 = editorAlert.D0();
                    }
                    c0Var.e = arrayList7;
                    c0Var.f = arrayList8;
                    c0Var.f();
                    if (!z4 && !z3 && (i = editorAlert.z1) > 0) {
                        editorAlert.q1.g1(0, -i);
                        editorAlert.z1 = -1000;
                    }
                    editorAlert.o1.c();
                    return;
                }
                return;
            case 9:
                anb anbVar = (anb) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((wd2) obj2).b;
                if (drawable instanceof ye7) {
                    ye7 ye7Var = (ye7) drawable;
                    ye7Var.r(i2, anb.e(bitmap));
                    ye7Var.s(anbVar.M);
                    anbVar.invalidate();
                    return;
                }
                return;
            case 10:
                jpb jpbVar = (jpb) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                mu1 mu1Var = (mu1) obj;
                int i10 = 0;
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i10).id == i2) {
                        tL_messageMediaToDo.todo.list.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                int i11 = 0;
                while (i11 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i11).id == i2) {
                        tL_messageMediaToDo.completions.remove(i11);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i11--;
                    }
                    i11++;
                }
                jpbVar.H.k.media = tL_messageMediaToDo;
                mu1Var.getSendMessagesHelper().s(jpbVar.H, null, null, null, null, null, null, null, false, false, null);
                mu1Var.ud(false);
                jpbVar.b(false);
                return;
            case 11:
                ysb ysbVar = (ysb) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = ysbVar.d;
                ArrayList arrayList12 = ysbVar.c;
                if (i2 == ysbVar.f) {
                    arrayList12.clear();
                    arrayList11.clear();
                    if (arrayList9 != null) {
                        arrayList12.addAll(arrayList9);
                        arrayList11.addAll(arrayList10);
                    }
                    ysbVar.f();
                    boolean isEmpty = arrayList12.isEmpty();
                    g24 g24Var = ysbVar.h.r;
                    if (isEmpty) {
                        g24Var.setVisibility(0);
                        return;
                    } else {
                        g24Var.setVisibility(8);
                        return;
                    }
                }
                return;
            default:
                z90 z90Var = (z90) obj3;
                ra0 ra0Var = (ra0) obj2;
                Runnable runnable = (Runnable) obj;
                lo9 lo9Var = (lo9) z90Var.f;
                try {
                    try {
                        lo9 lo9Var2 = (lo9) z90Var.c;
                        Objects.requireNonNull(lo9Var2);
                        lo9Var.f(new o6c(lo9Var2, (byte) 1));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) z90Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z90Var.a(ra0Var, i2);
                        } else {
                            lo9Var.f(new yf(z90Var, ra0Var, i2, (byte) 18));
                        }
                    } catch (wcb unused) {
                        ((xl3) z90Var.d).F(ra0Var, i2 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public ica(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public ica(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public ica(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
