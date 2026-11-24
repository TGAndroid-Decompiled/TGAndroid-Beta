package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ffa implements gk7 {
    public boolean E;
    public final wtc F;
    public boolean f;
    public boolean h;
    public final cfa[] n;
    public final long r;
    public final long s;
    public long w;
    public final d x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    public ffa(d dVar) {
        int i;
        TLRPC.ChatFull L0;
        this.x = dVar;
        if (dVar instanceof sy1) {
            sy1 sy1Var = (sy1) dVar;
            long a = sy1Var.a();
            this.r = a;
            this.w = sy1Var.M();
            this.s = sy1Var.d();
            if (a != dVar.getUserConfig().e()) {
                dVar.getMessagesController().D1().f(a, new p8c(this) {
                    public final ffa b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        byte b = r2;
                        int i2 = 0;
                        ffa ffaVar = this.b;
                        Boolean bool = (Boolean) obj;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = ffaVar.y;
                                boolean booleanValue = bool.booleanValue();
                                ffaVar.f = booleanValue;
                                ffaVar.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    while (i2 < size) {
                                        ((gfa) arrayList.get(i2)).Q();
                                        i2++;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList2 = ffaVar.y;
                                boolean booleanValue2 = bool.booleanValue();
                                ffaVar.f = booleanValue2;
                                ffaVar.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    while (i2 < size2) {
                                        ((gfa) arrayList2.get(i2)).Q();
                                        i2++;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (dVar instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) dVar;
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
                if (a2 != dVar.getUserConfig().e()) {
                    dVar.getMessagesController().D1().f(a2, new p8c(this) {
                        public final ffa b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            int i2 = 0;
                            ffa ffaVar = this.b;
                            Boolean bool = (Boolean) obj;
                            switch (b) {
                                case 0:
                                    ArrayList arrayList = ffaVar.y;
                                    boolean booleanValue = bool.booleanValue();
                                    ffaVar.f = booleanValue;
                                    ffaVar.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        while (i2 < size) {
                                            ((gfa) arrayList.get(i2)).Q();
                                            i2++;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ArrayList arrayList2 = ffaVar.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ffaVar.f = booleanValue2;
                                    ffaVar.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            ((gfa) arrayList2.get(i2)).Q();
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
        } else if (dVar instanceof zj6) {
            this.r = ((zj6) dVar).e;
        } else if (dVar instanceof cj3) {
            this.r = dVar.getUserConfig().e();
        }
        if (this.w == 0 && cf3.y(this.r) && (L0 = dVar.getMessagesController().L0(-this.r)) != null) {
            long j = L0.migrated_from_chat_id;
            if (j != 0) {
                this.w = -j;
            }
        }
        this.n = new cfa[9];
        int i2 = 0;
        while (true) {
            cfa[] cfaVarArr = this.n;
            if (i2 >= cfaVarArr.length) {
                break;
            }
            cfaVarArr[i2] = new cfa();
            cfa cfaVar = this.n[i2];
            if (cf3.B(this.r)) {
                i = Integer.MIN_VALUE;
            } else {
                i = Integer.MAX_VALUE;
            }
            cfaVar.j[0] = i;
            this.n[i2].j[1] = Integer.MAX_VALUE;
            i2++;
        }
        a();
        d dVar2 = this.x;
        if (dVar2 == null) {
            this.F = null;
            return;
        }
        kk7 notificationCenter = dVar2.getNotificationCenter();
        notificationCenter.getClass();
        wtc wtcVar = new wtc(notificationCenter, this);
        wtcVar.b(kk7.W);
        wtcVar.b(kk7.V);
        wtcVar.b(1);
        wtcVar.b(kk7.J);
        wtcVar.b(kk7.U);
        wtcVar.b(kk7.v);
        wtcVar.b(kk7.l0);
        wtcVar.b(kk7.S);
        wtcVar.b(kk7.X1);
        wtcVar.b(kk7.z5);
        wtcVar.b(kk7.h3);
        this.F = wtcVar;
    }

    public final void a() {
        d dVar = this.x;
        if (dVar != null) {
            hq6 mediaDataController = dVar.getMediaDataController();
            long j = this.s;
            mediaDataController.g0(this.r, dVar.getClassGuid(), j);
            if (this.w != 0) {
                dVar.getMediaDataController().g0(this.w, dVar.getClassGuid(), this.s);
            }
        }
    }

    public final void b(d dVar) {
        if (dVar == this.x) {
            this.y.clear();
            wtc wtcVar = this.F;
            if (wtcVar != null) {
                wtcVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        d dVar = this.x;
        if (dVar != null && chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.w == 0) {
                this.w = -j;
                dVar.getMediaDataController().g0(this.w, dVar.getClassGuid(), this.s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffa.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
