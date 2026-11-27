package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class wia implements fn7 {
    public boolean E;
    public final u8a F;
    public boolean f;
    public boolean h;
    public final tia[] n;
    public final long r;
    public final long s;
    public long w;
    public final e x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    public wia(e eVar) {
        int i;
        TLRPC.ChatFull N0;
        this.x = eVar;
        if (eVar instanceof kz1) {
            kz1 kz1Var = (kz1) eVar;
            long a = kz1Var.a();
            this.r = a;
            this.w = kz1Var.M();
            this.s = kz1Var.c();
            if (a != eVar.getUserConfig().e()) {
                eVar.getMessagesController().F1().f(a, new pcc(this) {
                    public final wia b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        int i2 = 0;
                        wia wiaVar = this.b;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = wiaVar.y;
                                boolean booleanValue = bool.booleanValue();
                                wiaVar.f = booleanValue;
                                wiaVar.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    while (i2 < size) {
                                        ((xia) arrayList.get(i2)).Q();
                                        i2++;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList2 = wiaVar.y;
                                boolean booleanValue2 = bool.booleanValue();
                                wiaVar.f = booleanValue2;
                                wiaVar.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    while (i2 < size2) {
                                        ((xia) arrayList2.get(i2)).Q();
                                        i2++;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (eVar instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) eVar;
            if (profileActivity.h1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a2 = profileActivity.a();
                this.r = a2;
                this.s = profileActivity.g1;
                TLRPC.ChatFull chatFull = profileActivity.v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a2 != eVar.getUserConfig().e()) {
                    eVar.getMessagesController().F1().f(a2, new pcc(this) {
                        public final wia b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            int i2 = 0;
                            wia wiaVar = this.b;
                            Boolean bool = (Boolean) obj;
                            switch (b) {
                                case 0:
                                    ArrayList arrayList = wiaVar.y;
                                    boolean booleanValue = bool.booleanValue();
                                    wiaVar.f = booleanValue;
                                    wiaVar.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        while (i2 < size) {
                                            ((xia) arrayList.get(i2)).Q();
                                            i2++;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ArrayList arrayList2 = wiaVar.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    wiaVar.f = booleanValue2;
                                    wiaVar.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            ((xia) arrayList2.get(i2)).Q();
                                            i2++;
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (eVar instanceof em6) {
            this.r = ((em6) eVar).e;
        } else if (eVar instanceof uj3) {
            this.r = eVar.getUserConfig().e();
        }
        if (this.w == 0 && wf3.y(this.r) && (N0 = eVar.getMessagesController().N0(-this.r)) != null) {
            long j = N0.migrated_from_chat_id;
            if (j != 0) {
                this.w = -j;
            }
        }
        this.n = new tia[9];
        int i2 = 0;
        while (true) {
            tia[] tiaVarArr = this.n;
            if (i2 >= tiaVarArr.length) {
                break;
            }
            tiaVarArr[i2] = new tia();
            tia tiaVar = this.n[i2];
            if (wf3.B(this.r)) {
                i = Integer.MIN_VALUE;
            } else {
                i = Integer.MAX_VALUE;
            }
            tiaVar.j[0] = i;
            this.n[i2].j[1] = Integer.MAX_VALUE;
            i2++;
        }
        a();
        e eVar2 = this.x;
        if (eVar2 == null) {
            this.F = null;
            return;
        }
        jn7 notificationCenter = eVar2.getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar = new u8a(notificationCenter, this);
        u8aVar.b(jn7.X);
        u8aVar.b(jn7.W);
        u8aVar.b(1);
        u8aVar.b(jn7.J);
        u8aVar.b(jn7.V);
        u8aVar.b(jn7.v);
        u8aVar.b(jn7.m0);
        u8aVar.b(jn7.T);
        u8aVar.b(jn7.Y1);
        u8aVar.b(jn7.A5);
        u8aVar.b(jn7.i3);
        this.F = u8aVar;
    }

    public final void a() {
        e eVar = this.x;
        if (eVar != null) {
            ls6 mediaDataController = eVar.getMediaDataController();
            long j = this.s;
            mediaDataController.g0(this.r, eVar.getClassGuid(), j);
            if (this.w != 0) {
                eVar.getMediaDataController().g0(this.w, eVar.getClassGuid(), this.s);
            }
        }
    }

    public final void b(e eVar) {
        if (eVar == this.x) {
            this.y.clear();
            u8a u8aVar = this.F;
            if (u8aVar != null) {
                u8aVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        e eVar = this.x;
        if (eVar != null && chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.w == 0) {
                this.w = -j;
                eVar.getMediaDataController().g0(this.w, eVar.getClassGuid(), this.s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wia.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
