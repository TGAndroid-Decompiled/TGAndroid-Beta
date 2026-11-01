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
public final class bt implements Runnable {
    public final int f15022a;
    public final pt f15023b;

    public bt(pt ptVar, int i10) {
        this.f15022a = i10;
        this.f15023b = ptVar;
    }

    @Override
    public final void run() {
        switch (this.f15022a) {
            case 0:
                pt ptVar = this.f15023b;
                ptVar.getNotificationCenter().b(ptVar, 142);
                return;
            case 1:
                pt ptVar2 = this.f15023b;
                ArrayList arrayList = ptVar2.f17644a;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    kj kjVar = (kj) arrayList.get(i10);
                    long B0 = kj.B0(kjVar.f16690k);
                    TLRPC.Message message = kjVar.f16690k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !o5.C(B0) && (kjVar.f16690k.peer_id.channel_id == 0 || kjVar.A4())) {
                        arrayList2.add(0, kjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !i0.p2(false) && !uz.C) {
                    i0.g3(new dt(ptVar2, arrayList2, 0));
                    return;
                }
                return;
            case 2:
                pt ptVar3 = this.f15023b;
                ptVar3.getClass();
                int i11 = Calendar.getInstance().get(11);
                if (i11 >= 11 && i11 <= 22) {
                    pt.f17638l0.b(ptVar3.f17650d0, null);
                    ptVar3.Z(true);
                    return;
                }
                ptVar3.R();
                return;
            case 3:
                pt ptVar4 = this.f15023b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - ptVar4.W) > 100) {
                        ptVar4.W = SystemClock.elapsedRealtime();
                        if (ptVar4.X == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            ptVar4.X = soundPool;
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
                        if (ptVar4.Z == 0 && !ptVar4.f17647b0) {
                            ptVar4.f17647b0 = true;
                            ptVar4.Z = ptVar4.X.load(w0.f18945b, 2131624201, 1);
                        }
                        int i12 = ptVar4.Z;
                        if (i12 != 0) {
                            try {
                                ptVar4.X.play(i12, 1.0f, 1.0f, 1, 0, 1.0f);
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
                this.f15023b.Z(false);
                return;
            case 5:
                pt.c(this.f15023b);
                return;
            case 6:
                pt ptVar5 = this.f15023b;
                a0.h hVar = ptVar5.h;
                pt.f17638l0.b(ptVar5.f17650d0, null);
                ptVar5.f17657n.b();
                for (int i13 = 0; i13 < hVar.m(); i13++) {
                    pt.f17638l0.b(((Integer) hVar.n(i13)).intValue(), null);
                }
                hVar.b();
                return;
            case 7:
                pt ptVar6 = this.f15023b;
                ptVar6.S(ptVar6.z());
                return;
            case 8:
                pt ptVar7 = this.f15023b;
                a0.h hVar2 = ptVar7.f17648c;
                ArrayList arrayList3 = ptVar7.f17644a;
                int i14 = 0;
                boolean z10 = false;
                while (i14 < arrayList3.size()) {
                    kj kjVar2 = (kj) arrayList3.get(i14);
                    if (kjVar2 != null && kjVar2.J) {
                        arrayList3.remove(i14);
                        i14--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(kj.B0(kjVar2.f16690k));
                        if (sparseArray != null) {
                            sparseArray.remove(kjVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(kj.B0(kjVar2.f16690k));
                        }
                        z10 = true;
                    }
                    i14++;
                }
                is messagesStorage = ptVar7.getMessagesStorage();
                messagesStorage.f16331a.c(new cr(messagesStorage, 20));
                if (z10) {
                    ptVar7.Z(false);
                    return;
                }
                return;
            case 9:
                pt ptVar8 = this.f15023b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (ptVar8.X == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            ptVar8.X = soundPool2;
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
                        if (ptVar8.Y == 0 && !ptVar8.f17645a0) {
                            ptVar8.f17645a0 = true;
                            ptVar8.Y = ptVar8.X.load(w0.f18945b, 2131624198, 1);
                        }
                        int i15 = ptVar8.Y;
                        if (i15 != 0) {
                            try {
                                ptVar8.X.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
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
                pt.b(this.f15023b);
                return;
            case 11:
                pt ptVar9 = this.f15023b;
                ArrayList arrayList4 = ptVar9.D;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                ptVar9.E.b();
                is messagesStorage2 = ptVar9.getMessagesStorage();
                messagesStorage2.f16331a.c(new cr(messagesStorage2, 16));
                if (!isEmpty) {
                    ptVar9.Z(false);
                    return;
                }
                return;
            case 12:
                pt ptVar10 = this.f15023b;
                ArrayList arrayList5 = ptVar10.D;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z11 = false;
                while (i16 < arrayList5.size()) {
                    ot otVar = (ot) arrayList5.get(i16);
                    Iterator it = otVar.f17511c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (otVar.f17511c.isEmpty()) {
                            is messagesStorage3 = ptVar10.getMessagesStorage();
                            messagesStorage3.f16331a.c(new dq(messagesStorage3, otVar.f17509a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            is messagesStorage4 = ptVar10.getMessagesStorage();
                            messagesStorage4.f16331a.c(new ir(4, messagesStorage4, otVar));
                        }
                    }
                    i16++;
                }
                if (z11) {
                    ptVar10.Z(false);
                }
                ptVar10.d0();
                return;
            default:
                pt ptVar11 = this.f15023b;
                PowerManager.WakeLock wakeLock = ptVar11.V;
                ArrayList arrayList6 = ptVar11.f17646b;
                if (v2.f18578a) {
                    f8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    ptVar11.Z(true);
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
