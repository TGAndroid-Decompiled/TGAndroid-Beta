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
public final class at implements Runnable {
    public final int f14667a;
    public final ot f14668b;

    public at(ot otVar, int i10) {
        this.f14667a = i10;
        this.f14668b = otVar;
    }

    @Override
    public final void run() {
        switch (this.f14667a) {
            case 0:
                ot otVar = this.f14668b;
                otVar.getNotificationCenter().b(otVar, 142);
                return;
            case 1:
                ot otVar2 = this.f14668b;
                ArrayList arrayList = otVar2.f17311a;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jj jjVar = (jj) arrayList.get(i10);
                    long B0 = jj.B0(jjVar.f16337k);
                    TLRPC.Message message = jjVar.f16337k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !o5.C(B0) && (jjVar.f16337k.peer_id.channel_id == 0 || jjVar.A4())) {
                        arrayList2.add(0, jjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !i0.p2(false) && !tz.C) {
                    i0.g3(new ct(otVar2, arrayList2, 0));
                    return;
                }
                return;
            case 2:
                ot otVar3 = this.f14668b;
                otVar3.getClass();
                int i11 = Calendar.getInstance().get(11);
                if (i11 >= 11 && i11 <= 22) {
                    ot.f17305l0.b(otVar3.f17317d0, null);
                    otVar3.Z(true);
                    return;
                }
                otVar3.R();
                return;
            case 3:
                ot otVar4 = this.f14668b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - otVar4.W) > 100) {
                        otVar4.W = SystemClock.elapsedRealtime();
                        if (otVar4.X == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            otVar4.X = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool2, int i12, int i13) {
                                    switch (r1) {
                                        case 0:
                                            if (i13 == 0) {
                                                try {
                                                    soundPool2.play(i12, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e) {
                                                    f8.g(e, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i13 == 0) {
                                                try {
                                                    soundPool2.play(i12, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e7) {
                                                    f8.g(e7, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (otVar4.Z == 0 && !otVar4.f17314b0) {
                            otVar4.f17314b0 = true;
                            otVar4.Z = otVar4.X.load(w0.f19025b, 2131624201, 1);
                        }
                        int i12 = otVar4.Z;
                        if (i12 != 0) {
                            try {
                                otVar4.X.play(i12, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e) {
                                f8.g(e, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 4:
                this.f14668b.Z(false);
                return;
            case 5:
                ot.c(this.f14668b);
                return;
            case 6:
                ot otVar5 = this.f14668b;
                a0.h hVar = otVar5.h;
                ot.f17305l0.b(otVar5.f17317d0, null);
                otVar5.f17324n.b();
                for (int i13 = 0; i13 < hVar.m(); i13++) {
                    ot.f17305l0.b(((Integer) hVar.n(i13)).intValue(), null);
                }
                hVar.b();
                return;
            case 7:
                ot otVar6 = this.f14668b;
                otVar6.S(otVar6.z());
                return;
            case 8:
                ot otVar7 = this.f14668b;
                a0.h hVar2 = otVar7.f17315c;
                ArrayList arrayList3 = otVar7.f17311a;
                int i14 = 0;
                boolean z10 = false;
                while (i14 < arrayList3.size()) {
                    jj jjVar2 = (jj) arrayList3.get(i14);
                    if (jjVar2 != null && jjVar2.J) {
                        arrayList3.remove(i14);
                        i14--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(jj.B0(jjVar2.f16337k));
                        if (sparseArray != null) {
                            sparseArray.remove(jjVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(jj.B0(jjVar2.f16337k));
                        }
                        z10 = true;
                    }
                    i14++;
                }
                hs messagesStorage = otVar7.getMessagesStorage();
                messagesStorage.f15938a.c(new br(messagesStorage, 20));
                if (z10) {
                    otVar7.Z(false);
                    return;
                }
                return;
            case 9:
                ot otVar8 = this.f14668b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (otVar8.X == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            otVar8.X = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                                @Override
                                public final void onLoadComplete(SoundPool soundPool22, int i122, int i132) {
                                    switch (r1) {
                                        case 0:
                                            if (i132 == 0) {
                                                try {
                                                    soundPool22.play(i122, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e10) {
                                                    f8.g(e10, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            if (i132 == 0) {
                                                try {
                                                    soundPool22.play(i122, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    return;
                                                } catch (Exception e72) {
                                                    f8.g(e72, true);
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                        if (otVar8.Y == 0 && !otVar8.f17312a0) {
                            otVar8.f17312a0 = true;
                            otVar8.Y = otVar8.X.load(w0.f19025b, 2131624198, 1);
                        }
                        int i15 = otVar8.Y;
                        if (i15 != 0) {
                            try {
                                otVar8.X.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
                                return;
                            } catch (Exception e10) {
                                f8.g(e10, true);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e11) {
                        f8.g(e11, true);
                        return;
                    }
                }
                return;
            case 10:
                ot.b(this.f14668b);
                return;
            case 11:
                ot otVar9 = this.f14668b;
                ArrayList arrayList4 = otVar9.D;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                otVar9.E.b();
                hs messagesStorage2 = otVar9.getMessagesStorage();
                messagesStorage2.f15938a.c(new br(messagesStorage2, 16));
                if (!isEmpty) {
                    otVar9.Z(false);
                    return;
                }
                return;
            case 12:
                ot otVar10 = this.f14668b;
                ArrayList arrayList5 = otVar10.D;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z11 = false;
                while (i16 < arrayList5.size()) {
                    nt ntVar = (nt) arrayList5.get(i16);
                    Iterator it = ntVar.f17174c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (ntVar.f17174c.isEmpty()) {
                            hs messagesStorage3 = otVar10.getMessagesStorage();
                            messagesStorage3.f15938a.c(new cq(messagesStorage3, ntVar.f17172a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            hs messagesStorage4 = otVar10.getMessagesStorage();
                            messagesStorage4.f15938a.c(new hr(4, messagesStorage4, ntVar));
                        }
                    }
                    i16++;
                }
                if (z11) {
                    otVar10.Z(false);
                }
                otVar10.d0();
                return;
            default:
                ot otVar11 = this.f14668b;
                PowerManager.WakeLock wakeLock = otVar11.V;
                ArrayList arrayList6 = otVar11.f17313b;
                if (v2.f18448a) {
                    f8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    otVar11.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
        }
    }
}
