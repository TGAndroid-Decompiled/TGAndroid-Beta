package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class up3 extends pf0 implements gk7 {
    public static volatile up3[] U = new up3[4];
    public int E;
    public boolean F;
    public final vf6 G;
    public final ArrayList H;
    public final ArrayList I;
    public final SparseArray J;
    public final tp3 K;
    public final tp3 L;
    public final tp3 M;
    public final tp3 N;
    public final tp3 O;
    public final tp3 P;
    public int Q;
    public int R;
    public int S;
    public final o1 T;
    public int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final HashMap f;
    public final HashMap h;
    public final HashMap n;
    public final HashMap r;
    public final SparseArray s;
    public boolean w;
    public final HashMap x;
    public final ArrayList y;

    public up3(int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up3.<init>(int):void");
    }

    public static up3 q(int i) {
        up3 up3Var;
        up3 up3Var2 = U[i];
        if (up3Var2 == null) {
            synchronized (up3.class) {
                up3Var = U[i];
                if (up3Var == null) {
                    up3[] up3VarArr = U;
                    up3 up3Var3 = new up3(i);
                    up3VarArr[i] = up3Var3;
                    up3Var = up3Var3;
                }
            }
            return up3Var;
        }
        return up3Var2;
    }

    public static float r(long[] jArr) {
        if (jArr.length >= 2) {
            long j = jArr[1];
            if (j != 0) {
                return Math.min(1.0f, ((float) jArr[0]) / ((float) j));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static int x(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 4) {
            return 1;
        }
        if (i != 8) {
            return 0;
        }
        return 2;
    }

    public final void a(String str, k27 k27Var, sp3 sp3Var) {
        if (this.w) {
            this.x.put(str, sp3Var);
            return;
        }
        v(sp3Var);
        HashMap hashMap = this.n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(sp3Var));
        if (k27Var != null) {
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(k27Var);
        }
        this.s.put(sp3Var.getObserverTag(), str);
    }

    public final int b(org.telegram.tgnet.TLRPC.Message r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up3.b(org.telegram.tgnet.TLRPC$Message):int");
    }

    public final boolean c(int i, long j) {
        tp3 n;
        int e = a.e();
        if (e == 1) {
            if (this.O.g) {
                n = p();
            } else {
                return false;
            }
        } else if (e == 2) {
            if (this.P.g) {
                n = o();
            } else {
                return false;
            }
        } else if (this.N.g) {
            n = n();
        } else {
            return false;
        }
        int i2 = n.a[1];
        long j2 = n.b[x(i)];
        if (i == 1 || (j != 0 && j <= j2)) {
            if (i == 2 || (i2 & i) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(k27 k27Var) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (k27Var.D == 23) {
            boolean z = gba.a;
            if (e66.e(1024) && (storyItem = ((TLRPC.TL_messageMediaStory) k27.m1(k27Var)).storyItem) != null && (messageMedia = storyItem.media) != null && messageMedia.document != null && storyItem.isPublic) {
                return true;
            }
            return false;
        } else if (k27Var.a1 != null) {
            return true;
        } else {
            if (!k27Var.x3() && e(k27Var) == 1) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        vf6 vf6Var = this.G;
        int i3 = kk7.Y1;
        SparseArray sparseArray = this.s;
        HashMap hashMap = this.n;
        if (i != i3 && i != kk7.R1) {
            if (i != kk7.X1 && i != kk7.Q1) {
                if (i == kk7.W1) {
                    this.w = true;
                    ArrayList arrayList = (ArrayList) hashMap.get((String) objArr[0]);
                    if (arrayList != null) {
                        Long l = (Long) objArr[1];
                        Long l2 = (Long) objArr[2];
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            WeakReference weakReference = (WeakReference) arrayList.get(i4);
                            if (weakReference.get() != null) {
                                ((sp3) weakReference.get()).i(l.longValue(), l2.longValue());
                            }
                        }
                    }
                    this.w = false;
                    u();
                    return;
                } else if (i == kk7.V1) {
                    this.w = true;
                    String str = (String) objArr[0];
                    ArrayList arrayList2 = (ArrayList) hashMap.get(str);
                    if (arrayList2 != null) {
                        Long l3 = (Long) objArr[1];
                        Long l4 = (Long) objArr[2];
                        Boolean bool = (Boolean) objArr[3];
                        int size2 = arrayList2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            WeakReference weakReference2 = (WeakReference) arrayList2.get(i5);
                            if (weakReference2.get() != null) {
                                long longValue = l3.longValue();
                                long longValue2 = l4.longValue();
                                bool.getClass();
                                ((sp3) weakReference2.get()).l(longValue, longValue2);
                            }
                        }
                    }
                    this.w = false;
                    u();
                    try {
                        ArrayList arrayList3 = (ArrayList) getSendMessagesHelper().a.get(str);
                        if (arrayList3 != null) {
                            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                k3a k3aVar = (k3a) arrayList3.get(i6);
                                if (k3aVar.n == null) {
                                    long j = k3aVar.a;
                                    Long l5 = (Long) vf6Var.f(j);
                                    if (k3aVar.e == 4) {
                                        if (l5 == null || l5.longValue() + 4000 < System.currentTimeMillis()) {
                                            k27 k27Var = (k27) k3aVar.E.get(str + "_i");
                                            if (k27Var != null) {
                                                if (k27.K4(k27Var.k)) {
                                                    getMessagesController().G4(5, 0, j, 0L, null);
                                                } else if (k27Var.F0() != null) {
                                                    getMessagesController().G4(3, 0, j, 0L, null);
                                                }
                                                vf6Var.k(Long.valueOf(System.currentTimeMillis()), j);
                                            }
                                            getMessagesController().G4(4, 0, j, 0L, null);
                                            vf6Var.k(Long.valueOf(System.currentTimeMillis()), j);
                                        }
                                    } else {
                                        k3aVar.m.F0();
                                        if (l5 == null || l5.longValue() + 4000 < System.currentTimeMillis()) {
                                            if (k3aVar.m.g4()) {
                                                getMessagesController().G4(8, 0, j, 0L, null);
                                            } else if (k27.K4(k3aVar.m.k)) {
                                                getMessagesController().G4(5, 0, j, 0L, null);
                                            } else if (k27.Q4(k3aVar.m.k)) {
                                                getMessagesController().G4(9, 0, j, 0L, null);
                                            } else if (k3aVar.m.F0() != null) {
                                                getMessagesController().G4(3, 0, j, 0L, null);
                                            } else if (k3aVar.g != null) {
                                                getMessagesController().G4(4, 0, j, 0L, null);
                                            }
                                            vf6Var.k(Long.valueOf(System.currentTimeMillis()), j);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.r;
            ArrayList arrayList4 = (ArrayList) hashMap2.get(str2);
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ((k27) arrayList4.get(i7)).z0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList5 = (ArrayList) hashMap.get(str2);
            if (arrayList5 != null) {
                int size4 = arrayList5.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    WeakReference weakReference3 = (WeakReference) arrayList5.get(i8);
                    if (weakReference3.get() != null) {
                        ((sp3) weakReference3.get()).N(str2);
                        sparseArray.remove(((sp3) weakReference3.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.w = false;
            u();
            h(0, str2);
            return;
        }
        String str3 = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        this.w = true;
        ArrayList arrayList6 = (ArrayList) hashMap.get(str3);
        if (arrayList6 != null) {
            int size5 = arrayList6.size();
            for (int i9 = 0; i9 < size5; i9++) {
                WeakReference weakReference4 = (WeakReference) arrayList6.get(i9);
                if (weakReference4.get() != null) {
                    sp3 sp3Var = (sp3) weakReference4.get();
                    if (num.intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sp3Var.B(z);
                    if (num.intValue() != 1) {
                        sparseArray.remove(((sp3) weakReference4.get()).getObserverTag());
                    }
                }
            }
            if (num.intValue() != 1) {
                hashMap.remove(str3);
            }
        }
        this.w = false;
        u();
        h(num.intValue(), str3);
    }

    public final int e(defpackage.k27 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up3.e(k27):int");
    }

    public final boolean f() {
        tp3 n;
        int e = a.e();
        if (e == 1) {
            if (!this.O.g) {
                return false;
            }
            n = p();
        } else if (e == 2) {
            if (!this.P.g) {
                return false;
            }
            n = o();
        } else if (!this.N.g) {
            return false;
        } else {
            n = n();
        }
        return n.e;
    }

    public final void g() {
        boolean z;
        int m = m();
        if (m != this.a) {
            this.a = m;
            int i = m & 1;
            ArrayList arrayList = this.b;
            if (i != 0) {
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    vp3 vp3Var = (vp3) arrayList.get(i2);
                    TLObject tLObject = vp3Var.a;
                    if (tLObject instanceof TLRPC.Photo) {
                        TLRPC.PhotoSize w = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false);
                        ba4 fileLoader = getFileLoader();
                        fileLoader.getClass();
                        fileLoader.e(null, null, null, w.location, null, null);
                    } else if (tLObject instanceof TLRPC.Document) {
                        getFileLoader().f((TLRPC.Document) vp3Var.a);
                    }
                }
                arrayList.clear();
            }
            int i3 = m & 2;
            ArrayList arrayList2 = this.c;
            if (i3 != 0) {
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    getFileLoader().f((TLRPC.Document) ((vp3) arrayList2.get(i4)).a);
                }
                arrayList2.clear();
            }
            int i5 = m & 8;
            ArrayList arrayList3 = this.d;
            if (i5 != 0) {
                if (arrayList3.isEmpty()) {
                    t(8);
                }
            } else {
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    getFileLoader().f((TLRPC.Document) ((vp3) arrayList3.get(i6)).a);
                }
                arrayList3.clear();
            }
            int i7 = m & 4;
            ArrayList arrayList4 = this.e;
            if (i7 != 0) {
                if (arrayList4.isEmpty()) {
                    t(4);
                }
            } else {
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    getFileLoader().f((TLRPC.Document) ((vp3) arrayList4.get(i8)).a);
                }
                arrayList4.clear();
            }
            if (!this.N.g && !this.P.g && !this.O.g) {
                z = false;
            } else {
                z = false;
                for (int i9 = 0; i9 < 4; i9++) {
                    if ((n().a[i9] & 1) != 0 || (p().a[i9] & 1) != 0 || (o().a[i9] & 1) != 0) {
                        z |= true;
                    }
                    if ((n().a[i9] & 2) != 0 || (p().a[i9] & 2) != 0 || (o().a[i9] & 2) != 0) {
                        z |= true;
                    }
                    if ((n().a[i9] & 4) != 0 || (p().a[i9] & 4) != 0 || (o().a[i9] & 4) != 0) {
                        z |= true;
                    }
                    if ((n().a[i9] & 8) != 0 || (p().a[i9] & 8) != 0 || (o().a[i9] & 8) != 0) {
                        z |= true;
                    }
                }
            }
            if (!z) {
                getMessagesStorage().q(0);
                return;
            }
            if (!(z & true)) {
                getMessagesStorage().q(1);
            }
            if (!(z & true)) {
                getMessagesStorage().q(2);
            }
            if (!(z & true)) {
                getMessagesStorage().q(4);
            }
            if (!(z & true)) {
                getMessagesStorage().q(8);
            }
        }
    }

    public final void h(int i, String str) {
        HashMap hashMap = this.f;
        vp3 vp3Var = (vp3) hashMap.get(str);
        if (vp3Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(vp3Var.c), Integer.valueOf(vp3Var.b)));
            if (i == 0 || i == 2) {
                ad7 messagesStorage = getMessagesStorage();
                long j = vp3Var.c;
                messagesStorage.a.c(new bb7(messagesStorage, vp3Var.b, j, (byte) 6));
            }
            int i2 = vp3Var.b;
            if (i2 == 1) {
                ArrayList arrayList = this.b;
                arrayList.remove(vp3Var);
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else if (i2 == 2) {
                ArrayList arrayList2 = this.c;
                arrayList2.remove(vp3Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else if (i2 == 4) {
                ArrayList arrayList3 = this.e;
                arrayList3.remove(vp3Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                }
            } else if (i2 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(vp3Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i, long j) {
        SparseArray sparseArray = this.J;
        k27 k27Var = (k27) sparseArray.get(i);
        if (k27Var != null && k27.B0(k27Var.k) == j) {
            sparseArray.remove(i);
            if (sparseArray.size() == 0) {
                getNotificationCenter().k(kk7.d5, new Object[0]);
            }
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i2 < arrayList2.size()) {
                    if (((k27) arrayList.get(i)).e1() == ((k27) arrayList2.get(i2)).e1() && k27.B0(((k27) arrayList2.get(i2)).k) == k27.B0(((k27) arrayList.get(i)).k)) {
                        arrayList2.remove(i2);
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.H;
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        if (((k27) arrayList.get(i)).e1() == ((k27) arrayList3.get(i3)).e1() && k27.B0(((k27) arrayList3.get(i3)).k) == k27.B0(((k27) arrayList.get(i)).k)) {
                            arrayList3.remove(i3);
                            break;
                        }
                        i3++;
                    }
                }
            }
            ((k27) arrayList.get(i)).P = false;
            ba4.G(this.currentAccount).X(((k27) arrayList.get(i)).F0(), arrayList.get(i), 0, 0);
            ba4.G(this.currentAccount).f(((k27) arrayList.get(i)).F0());
        }
        getNotificationCenter().k(kk7.d5, new Object[0]);
        getMessagesStorage().a.c(new ee2(this, arrayList, (byte) 3));
    }

    public final int k() {
        int i = this.E;
        this.E = i + 1;
        return i;
    }

    public final int l() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up3.l():int");
    }

    public final int m() {
        int e = a.e();
        int i = 0;
        if (e == 1) {
            if (this.O.g) {
                int i2 = 0;
                while (i < 4) {
                    i2 |= p().a[i];
                    i++;
                }
                return i2;
            }
        } else if (e == 2) {
            if (this.P.g) {
                int i3 = 0;
                while (i < 4) {
                    i3 |= o().a[i];
                    i++;
                }
                return i3;
            }
        } else if (this.N.g) {
            int i4 = 0;
            while (i < 4) {
                i4 |= n().a[i];
                i++;
            }
            return i4;
        }
        return 0;
    }

    public final tp3 n() {
        int i = this.Q;
        if (i == 0) {
            return this.K;
        }
        if (i == 1) {
            return this.L;
        }
        if (i == 2) {
            return this.M;
        }
        return this.N;
    }

    public final tp3 o() {
        int i = this.S;
        if (i == 0) {
            return this.K;
        }
        if (i == 1) {
            return this.L;
        }
        if (i == 2) {
            return this.M;
        }
        return this.P;
    }

    public final tp3 p() {
        int i = this.R;
        if (i == 0) {
            return this.K;
        }
        if (i == 1) {
            return this.L;
        }
        if (i == 2) {
            return this.M;
        }
        return this.O;
    }

    public final void s(boolean z) {
        if (!this.F) {
            if (z || Math.abs(System.currentTimeMillis() - getUserConfig().b0) >= 86400000) {
                this.F = true;
                getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new uf(this, (byte) 21));
            }
        }
    }

    public final void t(int i) {
        int m = m();
        if ((m & 1) != 0 && (i & 1) != 0 && this.b.isEmpty()) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new kc7(messagesStorage, 1, (byte) 1));
        }
        if ((m & 2) != 0 && (i & 2) != 0 && this.c.isEmpty()) {
            ad7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new kc7(messagesStorage2, 2, (byte) 1));
        }
        if ((m & 4) != 0 && (i & 4) != 0 && this.e.isEmpty()) {
            ad7 messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new kc7(messagesStorage3, 4, (byte) 1));
        }
        if ((m & 8) != 0 && (i & 8) != 0 && this.d.isEmpty()) {
            ad7 messagesStorage4 = getMessagesStorage();
            messagesStorage4.a.c(new kc7(messagesStorage4, 8, (byte) 1));
        }
    }

    public final void u() {
        HashMap hashMap = this.x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (sp3) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v((sp3) obj);
        }
        arrayList.clear();
    }

    public final void v(sp3 sp3Var) {
        if (this.w) {
            this.y.add(sp3Var);
            return;
        }
        int observerTag = sp3Var.getObserverTag();
        SparseArray sparseArray = this.s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i = 0;
                while (i < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i);
                    if (weakReference.get() == null || weakReference.get() == sp3Var) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(sp3Var.getObserverTag());
        }
    }

    public final void w(int i) {
        tp3 o;
        boolean z;
        int i2;
        long j;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i == 0) {
            o = n();
            z = this.N.g;
        } else if (i == 1) {
            o = p();
            z = this.O.g;
        } else {
            o = o();
            z = this.P.g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z2 = o.d;
        long[] jArr = o.b;
        tL_autoDownloadSettings.audio_preload_next = z2;
        tL_autoDownloadSettings.video_preload_large = o.c;
        tL_autoDownloadSettings.phonecalls_less_data = o.f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o.h;
        tL_autoDownloadSettings.disabled = !z;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            int[] iArr = o.a;
            if (i3 >= iArr.length) {
                break;
            }
            int i4 = iArr[i3];
            if ((i4 & 1) != 0) {
                z3 = true;
            }
            if ((i4 & 4) != 0) {
                z4 = true;
            }
            if ((i4 & 8) != 0) {
                z5 = true;
            }
            if (z3 && z4 && z5) {
                break;
            }
            i3++;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        if (z3) {
            i2 = (int) jArr[0];
        } else {
            i2 = 0;
        }
        tL_autoDownloadSettings2.photo_size_max = i2;
        long j2 = 0;
        if (z4) {
            j = jArr[1];
        } else {
            j = 0;
        }
        tL_autoDownloadSettings2.video_size_max = j;
        if (z5) {
            j2 = jArr[2];
        }
        tL_autoDownloadSettings2.file_size_max = j2;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new ce2((byte) 0));
    }

    public final void y() {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().S(((k27) arrayList.get(size)).S0())) {
                getFileLoader().X(((k27) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
