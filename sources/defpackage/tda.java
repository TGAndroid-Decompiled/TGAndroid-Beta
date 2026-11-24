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
public final class tda implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final Object d;
    public final Object e;

    public tda(fdb fdbVar, int i, String str, ArrayList arrayList) {
        this.a = (byte) 7;
        this.b = fdbVar;
        this.c = i;
        this.e = str;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        byte b = this.a;
        boolean z4 = true;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((nha) obj3).B0(i2, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 1:
                ik.c0(i2, (TLRPC.TL_error) obj2, ((nha) obj3).y1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 2:
                kga kgaVar = (kga) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                String str = (String) obj;
                nha nhaVar = kgaVar.w;
                if (kgaVar.h != 0) {
                    if (i2 == kgaVar.n) {
                        int b2 = kgaVar.b();
                        kgaVar.f = arrayList;
                        kgaVar.s--;
                        int b3 = kgaVar.b();
                        if (kgaVar.s == 0 || b3 != 0) {
                            nhaVar.z1(false);
                        }
                        int i3 = 0;
                        while (true) {
                            iga[] igaVarArr = nhaVar.n0;
                            if (i3 < igaVarArr.length) {
                                iga igaVar = igaVarArr[i3];
                                if (igaVar.F == kgaVar.r) {
                                    if (kgaVar.s == 0 && b3 == 0) {
                                        igaVar.w.d.setText(jb6.a0("NoResultFoundFor", null, 2131747900, str));
                                        igaVarArr[i3].w.f.setVisibility(8);
                                        igaVarArr[i3].w.e(false, true);
                                    } else if (b2 == 0) {
                                        nhaVar.i(igaVar.h, 0, null);
                                    }
                                }
                                i3++;
                            } else {
                                kgaVar.f();
                            }
                        }
                    }
                    kgaVar.h = 0;
                    return;
                }
                return;
            case 3:
                int i4 = this.c;
                wsa wsaVar = new wsa((Context) obj3, i4, z8c.h(i4).e(), (ylb) obj2, null);
                wsaVar.n2((TL_stars.SavedStarGift) obj, null);
                wsaVar.show();
                return;
            case 4:
                n1b n1bVar = (n1b) obj3;
                n1bVar.l((Bitmap) obj2, this.c, n1bVar.U, n1bVar.V, (t88) obj);
                return;
            case 5:
                z3b z3bVar = (z3b) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = z3bVar.k;
                int i5 = z3bVar.f;
                AbstractSet abstractSet2 = z3bVar.l;
                z3bVar.A = -1;
                StringBuilder sb = new StringBuilder("StoriesList ");
                byte b4 = z3bVar.e;
                sb.append((int) b4);
                sb.append("{");
                long j = z3bVar.d;
                sb.append(j);
                sb.append("} loaded {");
                sb.append(h4b.k0(arrayList2));
                hg9.r("}", sb);
                ArrayList arrayList3 = z3bVar.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i6 = z3bVar.c;
                oc7.r1(i6).d4(tL_stories_stories.users, false);
                oc7.r1(i6).X3(tL_stories_stories.chats, false);
                cf7.Y(i6).j1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                z3bVar.u = false;
                z3bVar.s = tL_stories_stories.count;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    z3bVar.t((k47) arrayList2.get(i7), false);
                }
                if (abstractSet2.size() >= z3bVar.s) {
                    z = true;
                } else {
                    z = false;
                }
                z3bVar.r = z;
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
                        int n = z3bVar.n();
                        Iterator it = abstractSet.iterator();
                        while (it.hasNext()) {
                            Integer num2 = (Integer) it.next();
                            int intValue2 = num2.intValue();
                            if (!abstractSet2.contains(num2) && intValue2 >= i2 && intValue2 <= n) {
                                it.remove();
                                z3bVar.u(intValue2, false);
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
                            z3bVar.u(intValue3, false);
                        }
                    }
                }
                z3bVar.d(true);
                if (z3bVar.r) {
                    HashMap hashMap = z3b.B;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        z3b.B = hashMap;
                    }
                    hashMap.put(Integer.valueOf(Objects.hash(Integer.valueOf(i6), Integer.valueOf(b4), Long.valueOf(j), Integer.valueOf(i5))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    z3bVar.w();
                }
                z3bVar.x();
                return;
            case 6:
                fdb fdbVar = (fdb) obj3;
                String[] strArr = (String[]) obj2;
                String str2 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i9 = fdbVar.a;
                hs6 d0 = hs6.d0(i9);
                gh ghVar = new gh(fdbVar, this.c, str2, hashSet, arrayList5);
                if (gda.E && z8c.h(i9).p()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d0.W(strArr, str2, true, ghVar, z2);
                return;
            case 7:
                fdb fdbVar2 = (fdb) obj3;
                String str3 = (String) obj;
                ArrayList arrayList6 = (ArrayList) obj2;
                if (i2 == fdbVar2.L) {
                    fdbVar2.K = str3;
                    fdbVar2.J = (byte) 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (!arrayList6.isEmpty()) {
                        fdbVar2.y = false;
                        fdbVar2.w = false;
                        fdbVar2.b();
                        bdb bdbVar = fdbVar2.d;
                        if (bdbVar != null) {
                            bdbVar.setVisibility(0);
                            fdbVar2.d.invalidate();
                        }
                        fdbVar2.x = arrayList6;
                        s30 s30Var = fdbVar2.f;
                        if (s30Var != null) {
                            s30Var.f();
                            return;
                        }
                        return;
                    }
                    fdbVar2.y = true;
                    fdbVar2.e();
                    return;
                }
                return;
            case 8:
                b1 b1Var = (b1) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                eb7 eb7Var = (eb7) obj;
                if (i2 != cmb.vm) {
                    b1Var.run();
                    return;
                }
                cmb.jm = sparseIntArray;
                eb7Var.run();
                return;
            case 9:
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
            case 10:
                bpb bpbVar = (bpb) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((hf2) obj2).b;
                if (drawable instanceof ah7) {
                    ah7 ah7Var = (ah7) drawable;
                    ah7Var.r(i2, bpb.e(bitmap));
                    ah7Var.s(bpbVar.M);
                    bpbVar.invalidate();
                    return;
                }
                return;
            case 11:
                krb krbVar = (krb) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                yv1 yv1Var = (yv1) obj;
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
                krbVar.H.k.media = tL_messageMediaToDo;
                yv1Var.getSendMessagesHelper().s(krbVar.H, null, null, null, null, null, null, null, false, false, null);
                yv1Var.Gd(false);
                krbVar.b(false);
                return;
            case 12:
                zub zubVar = (zub) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = zubVar.d;
                ArrayList arrayList12 = zubVar.c;
                if (i2 == zubVar.f) {
                    arrayList12.clear();
                    arrayList11.clear();
                    if (arrayList9 != null) {
                        arrayList12.addAll(arrayList9);
                        arrayList11.addAll(arrayList10);
                    }
                    zubVar.f();
                    boolean isEmpty = arrayList12.isEmpty();
                    r34 r34Var = zubVar.h.r;
                    if (isEmpty) {
                        r34Var.setVisibility(0);
                        return;
                    } else {
                        r34Var.setVisibility(8);
                        return;
                    }
                }
                return;
            default:
                za0 za0Var = (za0) obj3;
                rb0 rb0Var = (rb0) obj2;
                Runnable runnable = (Runnable) obj;
                mq9 mq9Var = (mq9) za0Var.f;
                try {
                    try {
                        mq9 mq9Var2 = (mq9) za0Var.c;
                        Objects.requireNonNull(mq9Var2);
                        mq9Var.f(new p8c(mq9Var2, (byte) 1));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) za0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            za0Var.a(rb0Var, i2);
                        } else {
                            mq9Var.f(new yg(za0Var, rb0Var, i2, (byte) 19));
                        }
                    } catch (xeb unused) {
                        ((in3) za0Var.d).E(rb0Var, i2 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public tda(int i, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = i;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public tda(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = obj2;
        this.e = obj3;
    }

    public tda(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
        this.e = obj3;
    }

    public tda(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i;
    }
}
