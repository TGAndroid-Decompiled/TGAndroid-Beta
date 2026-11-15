package org.telegram.messenger;

import android.media.SoundPool;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class os implements Runnable {
    public final int f25800a;
    public final at f25801b;

    public os(at atVar, int i7) {
        this.f25800a = i7;
        this.f25801b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f25800a) {
            case 0:
                at atVar = this.f25801b;
                ArrayList arrayList = atVar.f22565a;
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    gj gjVar = (gj) arrayList.get(i7);
                    long B0 = gj.B0(gjVar.f23819k);
                    TLRPC.Message message = gjVar.f23819k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && (gjVar.f23819k.peer_id.channel_id == 0 || gjVar.A4())) {
                        arrayList2.add(0, gjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !gz.C) {
                    g0.h3(new qs(atVar, arrayList2, 0));
                    return;
                }
                return;
            case 1:
                at atVar2 = this.f25801b;
                atVar2.getClass();
                int i10 = Calendar.getInstance().get(11);
                if (i10 >= 11 && i10 <= 22) {
                    at.m0.b(atVar2.f22573e0, null);
                    atVar2.Z(true);
                    return;
                }
                atVar2.R();
                return;
            case 2:
                at atVar3 = this.f25801b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - atVar3.X) > 100) {
                        atVar3.X = SystemClock.elapsedRealtime();
                        if (atVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            atVar3.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool2, int i11, int i12) {
                                    switch (r1) {
                                        case 0:
                                            if (i12 == 0) {
                                                try {
                                                    soundPool2.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e10) {
                                                    a8.g(e10, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i12 == 0) {
                                                try {
                                                    soundPool2.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (atVar3.f22566a0 == 0 && !atVar3.f22570c0) {
                            atVar3.f22570c0 = true;
                            atVar3.f22566a0 = atVar3.Y.load(t0.f26609b, 2131624204, 1);
                        }
                        int i11 = atVar3.f22566a0;
                        if (i11 != 0) {
                            try {
                                atVar3.Y.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 3:
                this.f25801b.Z(false);
                return;
            case 4:
                at.c(this.f25801b);
                return;
            case 5:
                at atVar4 = this.f25801b;
                a0.h hVar = atVar4.h;
                at.m0.b(atVar4.f22573e0, null);
                atVar4.f22580n.b();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    at.m0.b(((Integer) hVar.n(i12)).intValue(), null);
                }
                hVar.b();
                return;
            case 6:
                at atVar5 = this.f25801b;
                a0.h hVar2 = atVar5.f22569c;
                ArrayList arrayList3 = atVar5.f22565a;
                int i13 = 0;
                boolean z10 = false;
                while (i13 < arrayList3.size()) {
                    gj gjVar2 = (gj) arrayList3.get(i13);
                    if (gjVar2 != null && gjVar2.J) {
                        arrayList3.remove(i13);
                        i13--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(gj.B0(gjVar2.f23819k));
                        if (sparseArray != null) {
                            sparseArray.remove(gjVar2.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(gj.B0(gjVar2.f23819k));
                        }
                        z10 = true;
                    }
                    i13++;
                }
                vr messagesStorage = atVar5.getMessagesStorage();
                messagesStorage.f27219a.c(new nq(messagesStorage, 18));
                if (z10) {
                    atVar5.Z(false);
                    return;
                }
                return;
            case 7:
                at atVar6 = this.f25801b;
                atVar6.S(atVar6.z());
                return;
            case 8:
                at atVar7 = this.f25801b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (atVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            atVar7.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool22, int i112, int i122) {
                                    switch (r1) {
                                        case 0:
                                            if (i122 == 0) {
                                                try {
                                                    soundPool22.play(i112, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e102) {
                                                    a8.g(e102, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i122 == 0) {
                                                try {
                                                    soundPool22.play(i112, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e112) {
                                                    a8.g(e112, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (atVar7.Z == 0 && !atVar7.f22568b0) {
                            atVar7.f22568b0 = true;
                            atVar7.Z = atVar7.Y.load(t0.f26609b, 2131624201, 1);
                        }
                        int i14 = atVar7.Z;
                        if (i14 != 0) {
                            try {
                                atVar7.Y.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e12) {
                                a8.g(e12, true);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e13) {
                        a8.g(e13, true);
                        return;
                    }
                }
                return;
            case 9:
                at.b(this.f25801b);
                return;
            case 10:
                at atVar8 = this.f25801b;
                ArrayList arrayList4 = atVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                atVar8.F.b();
                vr messagesStorage2 = atVar8.getMessagesStorage();
                messagesStorage2.f27219a.c(new nq(messagesStorage2, 14));
                if (!isEmpty) {
                    atVar8.Z(false);
                    return;
                }
                return;
            case 11:
                at atVar9 = this.f25801b;
                ArrayList arrayList5 = atVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i15 = 0;
                boolean z11 = false;
                while (i15 < arrayList5.size()) {
                    zs zsVar = (zs) arrayList5.get(i15);
                    Iterator it = zsVar.f28001c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (zsVar.f28001c.isEmpty()) {
                            vr messagesStorage3 = atVar9.getMessagesStorage();
                            messagesStorage3.f27219a.c(new rp(messagesStorage3, zsVar.f27999a, 4));
                            arrayList5.remove(i15);
                            i15--;
                        } else {
                            vr messagesStorage4 = atVar9.getMessagesStorage();
                            messagesStorage4.f27219a.c(new pq(7, messagesStorage4, zsVar));
                        }
                    }
                    i15++;
                }
                if (z11) {
                    atVar9.Z(false);
                }
                atVar9.d0();
                return;
            case 12:
                at atVar10 = this.f25801b;
                PowerManager.WakeLock wakeLock = atVar10.W;
                ArrayList arrayList6 = atVar10.f22567b;
                if (r2.f26206a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    atVar10.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    a8.g(e14, true);
                    return;
                }
            default:
                at atVar11 = this.f25801b;
                atVar11.getNotificationCenter().b(atVar11, 142);
                return;
        }
    }
}
