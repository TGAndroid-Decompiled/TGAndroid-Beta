package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseIntArray;
import android.view.View;
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
public final class efa implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final Object d;
    public final Object e;

    public efa(int i, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = i;
        this.b = obj;
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
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                jj.c0(i2, (TLRPC.TL_error) obj2, ((eja) obj3).y1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 1:
                ((eja) obj3).N0((r47) obj2, (View) obj, i2, false);
                return;
            case 2:
                ((eja) obj3).B0(i2, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 3:
                bia biaVar = (bia) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                String str = (String) obj;
                eja ejaVar = biaVar.w;
                if (biaVar.h != 0) {
                    if (i2 == biaVar.n) {
                        int b2 = biaVar.b();
                        biaVar.f = arrayList;
                        biaVar.s--;
                        int b3 = biaVar.b();
                        if (biaVar.s == 0 || b3 != 0) {
                            ejaVar.z1(false);
                        }
                        int i3 = 0;
                        while (true) {
                            zha[] zhaVarArr = ejaVar.n0;
                            if (i3 < zhaVarArr.length) {
                                zha zhaVar = zhaVarArr[i3];
                                if (zhaVar.F == biaVar.r) {
                                    if (biaVar.s == 0 && b3 == 0) {
                                        zhaVar.w.d.setText(ob6.a0("NoResultFoundFor", null, 2131747897, str));
                                        zhaVarArr[i3].w.f.setVisibility(8);
                                        zhaVarArr[i3].w.e(false, true);
                                    } else if (b2 == 0) {
                                        ejaVar.i(zhaVar.h, 0, null);
                                    }
                                }
                                i3++;
                            } else {
                                biaVar.f();
                            }
                        }
                    }
                    biaVar.h = 0;
                    return;
                }
                return;
            case 4:
                int i4 = this.c;
                wua wuaVar = new wua((Context) obj3, i4, yac.h(i4).e(), (vnb) obj2, null);
                wuaVar.o2((TL_stars.SavedStarGift) obj, null);
                wuaVar.show();
                return;
            case 5:
                k3b k3bVar = (k3b) obj3;
                k3bVar.l((Bitmap) obj2, this.c, k3bVar.U, k3bVar.V, (ea8) obj);
                return;
            case 6:
                u5b u5bVar = (u5b) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = u5bVar.k;
                int i5 = u5bVar.f;
                AbstractSet abstractSet2 = u5bVar.l;
                u5bVar.A = -1;
                StringBuilder sb = new StringBuilder("StoriesList ");
                byte b4 = u5bVar.e;
                sb.append((int) b4);
                sb.append("{");
                long j = u5bVar.d;
                sb.append(j);
                sb.append("} loaded {");
                sb.append(c6b.k0(arrayList2));
                uh9.s("}", sb);
                ArrayList arrayList3 = u5bVar.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i6 = u5bVar.c;
                uc7.s1(i6).j4(tL_stories_stories.users, false);
                uc7.s1(i6).c4(tL_stories_stories.chats, false);
                jf7.Y(i6).j1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                u5bVar.u = false;
                u5bVar.s = tL_stories_stories.count;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    u5bVar.t((r47) arrayList2.get(i7), false);
                }
                if (abstractSet2.size() >= u5bVar.s) {
                    z = true;
                } else {
                    z = false;
                }
                u5bVar.r = z;
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
                        int n = u5bVar.n();
                        Iterator it = abstractSet.iterator();
                        while (it.hasNext()) {
                            Integer num2 = (Integer) it.next();
                            int intValue2 = num2.intValue();
                            if (!abstractSet2.contains(num2) && intValue2 >= i2 && intValue2 <= n) {
                                it.remove();
                                u5bVar.u(intValue2, false);
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
                            u5bVar.u(intValue3, false);
                        }
                    }
                }
                u5bVar.d(true);
                if (u5bVar.r) {
                    HashMap hashMap = u5b.B;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        u5b.B = hashMap;
                    }
                    hashMap.put(Integer.valueOf(Objects.hash(Integer.valueOf(i6), Integer.valueOf(b4), Long.valueOf(j), Integer.valueOf(i5))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    u5bVar.w();
                }
                u5bVar.x();
                return;
            case 7:
                zeb zebVar = (zeb) obj3;
                String[] strArr = (String[]) obj2;
                String str2 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i9 = zebVar.a;
                ls6 d0 = ls6.d0(i9);
                eg egVar = new eg(zebVar, str2, this.c, hashSet, arrayList5);
                if (xea.E && yac.h(i9).p()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d0.W(strArr, str2, true, egVar, z2);
                return;
            case 8:
                zeb zebVar2 = (zeb) obj3;
                String str3 = (String) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (i2 == zebVar2.L) {
                    zebVar2.K = str3;
                    zebVar2.J = (byte) 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (!arrayList6.isEmpty()) {
                        zebVar2.y = false;
                        zebVar2.w = false;
                        zebVar2.b();
                        h8b h8bVar = zebVar2.d;
                        if (h8bVar != null) {
                            h8bVar.setVisibility(0);
                            zebVar2.d.invalidate();
                        }
                        zebVar2.x = arrayList6;
                        t20 t20Var = zebVar2.f;
                        if (t20Var != null) {
                            t20Var.f();
                            return;
                        }
                        return;
                    }
                    zebVar2.y = true;
                    zebVar2.e();
                    return;
                }
                return;
            case 9:
                c1 c1Var = (c1) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                lb7 lb7Var = (lb7) obj;
                if (i2 != aob.wm) {
                    c1Var.run();
                    return;
                }
                aob.km = sparseIntArray;
                lb7Var.run();
                return;
            case 10:
                c0 c0Var = (c0) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = c0Var.r;
                u uVar = editorAlert.m1;
                if (i2 == c0Var.d) {
                    c0 c0Var2 = editorAlert.s1;
                    if (uVar.getAdapter() != c0Var2) {
                        editorAlert.z1 = editorAlert.E0();
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
                        editorAlert.z1 = editorAlert.E0();
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
            case 11:
                zqb zqbVar = (zqb) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Drawable drawable = ((ne2) obj2).b;
                if (drawable instanceof hh7) {
                    hh7 hh7Var = (hh7) drawable;
                    hh7Var.r(i2, zqb.e(bitmap));
                    hh7Var.s(zqbVar.M);
                    zqbVar.invalidate();
                    return;
                }
                return;
            case 12:
                ktb ktbVar = (ktb) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                zu1 zu1Var = (zu1) obj;
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
                ktbVar.H.k.media = tL_messageMediaToDo;
                zu1Var.getSendMessagesHelper().s(ktbVar.H, null, null, null, null, null, null, null, false, false, null);
                zu1Var.Gd(false);
                ktbVar.b(false);
                return;
            case 13:
                zwb zwbVar = (zwb) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = zwbVar.d;
                ArrayList arrayList12 = zwbVar.c;
                if (i2 == zwbVar.f) {
                    arrayList12.clear();
                    arrayList11.clear();
                    if (arrayList9 != null) {
                        arrayList12.addAll(arrayList9);
                        arrayList11.addAll(arrayList10);
                    }
                    zwbVar.f();
                    boolean isEmpty = arrayList12.isEmpty();
                    b34 b34Var = zwbVar.h.r;
                    if (isEmpty) {
                        b34Var.setVisibility(0);
                        return;
                    } else {
                        b34Var.setVisibility(8);
                        return;
                    }
                }
                return;
            default:
                ba0 ba0Var = (ba0) obj3;
                ta0 ta0Var = (ta0) obj2;
                Runnable runnable = (Runnable) obj;
                ds9 ds9Var = (ds9) ba0Var.f;
                try {
                    try {
                        ds9 ds9Var2 = (ds9) ba0Var.c;
                        Objects.requireNonNull(ds9Var2);
                        ds9Var.f(new oac(ds9Var2, (byte) 1));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) ba0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            ba0Var.a(ta0Var, i2);
                        } else {
                            ds9Var.f(new bf(ba0Var, ta0Var, i2, (byte) 20));
                        }
                    } catch (rgb unused) {
                        ((pm3) ba0Var.d).E(ta0Var, i2 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public efa(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = obj2;
        this.e = obj3;
    }

    public efa(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
        this.e = obj3;
    }

    public efa(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i;
    }
}
