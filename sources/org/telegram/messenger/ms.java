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
public final class ms implements Runnable {
    public final int f25625a;
    public final ys f25626b;

    public ms(ys ysVar, int i7) {
        this.f25625a = i7;
        this.f25626b = ysVar;
    }

    @Override
    public final void run() {
        switch (this.f25625a) {
            case 0:
                ys ysVar = this.f25626b;
                ArrayList arrayList = ysVar.f28176a;
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    gj gjVar = (gj) arrayList.get(i7);
                    long B0 = gj.B0(gjVar.f24213k);
                    TLRPC.Message message = gjVar.f24213k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !n5.C(B0) && (gjVar.f24213k.peer_id.channel_id == 0 || gjVar.A4())) {
                        arrayList2.add(0, gjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !cz.C) {
                    g0.g3(new os(ysVar, arrayList2, 0));
                    return;
                }
                return;
            case 1:
                ys ysVar2 = this.f25626b;
                ysVar2.getClass();
                int i10 = Calendar.getInstance().get(11);
                if (i10 >= 11 && i10 <= 22) {
                    ys.m0.b(ysVar2.f28184e0, null);
                    ysVar2.Z(true);
                    return;
                }
                ysVar2.R();
                return;
            case 2:
                ys ysVar3 = this.f25626b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - ysVar3.X) > 100) {
                        ysVar3.X = SystemClock.elapsedRealtime();
                        if (ysVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            ysVar3.Y = soundPool;
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
                        if (ysVar3.f28177a0 == 0 && !ysVar3.f28181c0) {
                            ysVar3.f28181c0 = true;
                            ysVar3.f28177a0 = ysVar3.Y.load(t0.f26931b, 2131624204, 1);
                        }
                        int i11 = ysVar3.f28177a0;
                        if (i11 != 0) {
                            try {
                                ysVar3.Y.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
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
                this.f25626b.Z(false);
                return;
            case 4:
                ys.c(this.f25626b);
                return;
            case 5:
                ys ysVar4 = this.f25626b;
                a0.h hVar = ysVar4.h;
                ys.m0.b(ysVar4.f28184e0, null);
                ysVar4.f28191n.b();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    ys.m0.b(((Integer) hVar.n(i12)).intValue(), null);
                }
                hVar.b();
                return;
            case 6:
                ys ysVar5 = this.f25626b;
                a0.h hVar2 = ysVar5.f28180c;
                ArrayList arrayList3 = ysVar5.f28176a;
                int i13 = 0;
                boolean z10 = false;
                while (i13 < arrayList3.size()) {
                    gj gjVar2 = (gj) arrayList3.get(i13);
                    if (gjVar2 != null && gjVar2.J) {
                        arrayList3.remove(i13);
                        i13--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(gj.B0(gjVar2.f24213k));
                        if (sparseArray != null) {
                            sparseArray.remove(gjVar2.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(gj.B0(gjVar2.f24213k));
                        }
                        z10 = true;
                    }
                    i13++;
                }
                ur messagesStorage = ysVar5.getMessagesStorage();
                messagesStorage.f27250a.c(new qq(messagesStorage, 19));
                if (z10) {
                    ysVar5.Z(false);
                    return;
                }
                return;
            case 7:
                ys ysVar6 = this.f25626b;
                ysVar6.S(ysVar6.z());
                return;
            case 8:
                ys ysVar7 = this.f25626b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (ysVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            ysVar7.Y = soundPool2;
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
                        if (ysVar7.Z == 0 && !ysVar7.f28179b0) {
                            ysVar7.f28179b0 = true;
                            ysVar7.Z = ysVar7.Y.load(t0.f26931b, 2131624201, 1);
                        }
                        int i14 = ysVar7.Z;
                        if (i14 != 0) {
                            try {
                                ysVar7.Y.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
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
                ys.b(this.f25626b);
                return;
            case 10:
                ys ysVar8 = this.f25626b;
                ArrayList arrayList4 = ysVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                ysVar8.F.b();
                ur messagesStorage2 = ysVar8.getMessagesStorage();
                messagesStorage2.f27250a.c(new qq(messagesStorage2, 14));
                if (!isEmpty) {
                    ysVar8.Z(false);
                    return;
                }
                return;
            case 11:
                ys ysVar9 = this.f25626b;
                ArrayList arrayList5 = ysVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i15 = 0;
                boolean z11 = false;
                while (i15 < arrayList5.size()) {
                    xs xsVar = (xs) arrayList5.get(i15);
                    Iterator it = xsVar.f27958c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (xsVar.f27958c.isEmpty()) {
                            ur messagesStorage3 = ysVar9.getMessagesStorage();
                            messagesStorage3.f27250a.c(new qp(messagesStorage3, xsVar.f27956a, 4));
                            arrayList5.remove(i15);
                            i15--;
                        } else {
                            ur messagesStorage4 = ysVar9.getMessagesStorage();
                            messagesStorage4.f27250a.c(new sq(9, messagesStorage4, xsVar));
                        }
                    }
                    i15++;
                }
                if (z11) {
                    ysVar9.Z(false);
                }
                ysVar9.d0();
                return;
            case 12:
                ys ysVar10 = this.f25626b;
                PowerManager.WakeLock wakeLock = ysVar10.W;
                ArrayList arrayList6 = ysVar10.f28178b;
                if (s2.f26730a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    ysVar10.Z(true);
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
                ys ysVar11 = this.f25626b;
                ysVar11.getNotificationCenter().b(ysVar11, 142);
                return;
        }
    }
}
