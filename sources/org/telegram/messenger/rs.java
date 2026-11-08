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
public final class rs implements Runnable {
    public final int f25325a;
    public final dt f25326b;

    public rs(dt dtVar, int i7) {
        this.f25325a = i7;
        this.f25326b = dtVar;
    }

    @Override
    public final void run() {
        switch (this.f25325a) {
            case 0:
                dt dtVar = this.f25326b;
                ArrayList arrayList = dtVar.f22083a;
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ij ijVar = (ij) arrayList.get(i7);
                    long B0 = ij.B0(ijVar.f23262k);
                    TLRPC.Message message = ijVar.f23262k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && (ijVar.f23262k.peer_id.channel_id == 0 || ijVar.B4())) {
                        arrayList2.add(0, ijVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !iz.C) {
                    g0.h3(new ts(dtVar, arrayList2, 0));
                    return;
                }
                return;
            case 1:
                dt dtVar2 = this.f25326b;
                dtVar2.getClass();
                int i10 = Calendar.getInstance().get(11);
                if (i10 >= 11 && i10 <= 22) {
                    dt.f22077l0.b(dtVar2.f22089d0, null);
                    dtVar2.Z(true);
                    return;
                }
                dtVar2.R();
                return;
            case 2:
                dt dtVar3 = this.f25326b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - dtVar3.W) > 100) {
                        dtVar3.W = SystemClock.elapsedRealtime();
                        if (dtVar3.X == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            dtVar3.X = soundPool;
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
                        if (dtVar3.Z == 0 && !dtVar3.f22086b0) {
                            dtVar3.f22086b0 = true;
                            dtVar3.Z = dtVar3.X.load(t0.f25566b, 2131624203, 1);
                        }
                        int i11 = dtVar3.Z;
                        if (i11 != 0) {
                            try {
                                dtVar3.X.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
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
                this.f25326b.Z(false);
                return;
            case 4:
                dt.c(this.f25326b);
                return;
            case 5:
                dt dtVar4 = this.f25326b;
                a0.h hVar = dtVar4.h;
                dt.f22077l0.b(dtVar4.f22089d0, null);
                dtVar4.f22097n.b();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    dt.f22077l0.b(((Integer) hVar.n(i12)).intValue(), null);
                }
                hVar.b();
                return;
            case 6:
                dt dtVar5 = this.f25326b;
                a0.h hVar2 = dtVar5.f22087c;
                ArrayList arrayList3 = dtVar5.f22083a;
                int i13 = 0;
                boolean z9 = false;
                while (i13 < arrayList3.size()) {
                    ij ijVar2 = (ij) arrayList3.get(i13);
                    if (ijVar2 != null && ijVar2.J) {
                        arrayList3.remove(i13);
                        i13--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(ij.B0(ijVar2.f23262k));
                        if (sparseArray != null) {
                            sparseArray.remove(ijVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(ij.B0(ijVar2.f23262k));
                        }
                        z9 = true;
                    }
                    i13++;
                }
                yr messagesStorage = dtVar5.getMessagesStorage();
                messagesStorage.f26719a.c(new rq(messagesStorage, 17));
                if (z9) {
                    dtVar5.Z(false);
                    return;
                }
                return;
            case 7:
                dt dtVar6 = this.f25326b;
                dtVar6.S(dtVar6.z());
                return;
            case 8:
                dt dtVar7 = this.f25326b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (dtVar7.X == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            dtVar7.X = soundPool2;
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
                        if (dtVar7.Y == 0 && !dtVar7.f22084a0) {
                            dtVar7.f22084a0 = true;
                            dtVar7.Y = dtVar7.X.load(t0.f25566b, 2131624200, 1);
                        }
                        int i14 = dtVar7.Y;
                        if (i14 != 0) {
                            try {
                                dtVar7.X.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
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
                dt.b(this.f25326b);
                return;
            case 10:
                dt dtVar8 = this.f25326b;
                ArrayList arrayList4 = dtVar8.D;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                dtVar8.E.b();
                yr messagesStorage2 = dtVar8.getMessagesStorage();
                messagesStorage2.f26719a.c(new rq(messagesStorage2, 14));
                if (!isEmpty) {
                    dtVar8.Z(false);
                    return;
                }
                return;
            case 11:
                dt dtVar9 = this.f25326b;
                ArrayList arrayList5 = dtVar9.D;
                long currentTimeMillis = System.currentTimeMillis();
                int i15 = 0;
                boolean z10 = false;
                while (i15 < arrayList5.size()) {
                    ct ctVar = (ct) arrayList5.get(i15);
                    Iterator it = ctVar.f21933c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z10 = true;
                        }
                    }
                    if (z10) {
                        if (ctVar.f21933c.isEmpty()) {
                            yr messagesStorage3 = dtVar9.getMessagesStorage();
                            messagesStorage3.f26719a.c(new xp(messagesStorage3, ctVar.f21931a, 4));
                            arrayList5.remove(i15);
                            i15--;
                        } else {
                            yr messagesStorage4 = dtVar9.getMessagesStorage();
                            messagesStorage4.f26719a.c(new zq(5, messagesStorage4, ctVar));
                        }
                    }
                    i15++;
                }
                if (z10) {
                    dtVar9.Z(false);
                }
                dtVar9.d0();
                return;
            case 12:
                dt dtVar10 = this.f25326b;
                PowerManager.WakeLock wakeLock = dtVar10.V;
                ArrayList arrayList6 = dtVar10.f22085b;
                if (r2.f25212a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    dtVar10.Z(true);
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
                dt dtVar11 = this.f25326b;
                dtVar11.getNotificationCenter().b(dtVar11, 142);
                return;
        }
    }
}
