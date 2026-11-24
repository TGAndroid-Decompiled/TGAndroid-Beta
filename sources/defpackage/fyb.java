package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class fyb implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public fyb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onClick(View view) {
        long j;
        sm2 sm2Var;
        long j2 = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                ((oyb) this.b).d();
                yv1 yv1Var = ((bt1) this.c).a;
                wvb f0 = wvb.f0(-yv1Var.l6, 0L);
                f0.E = yv1Var;
                yv1Var.presentFragment(f0);
                return;
            case 1:
                c2c c2cVar = (c2c) this.b;
                c2cVar.f2 = false;
                c2cVar.S0();
                ((l7c) this.c).O(true);
                c2cVar.D0();
                return;
            case 2:
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = ((x1c) this.b).s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(d53.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                zs1 zs1Var = (zs1) this.b;
                ((m8) this.c).d(true);
                g2c.a(zs1Var.getContext(), zs1Var.d);
                return;
            case 4:
                b61 b61Var = (b61) this.b;
                my0 my0Var = (my0) this.c;
                if (b61Var.J > 0) {
                    gm.A3(3.0f, b61Var, null);
                    xx0.APP_ERROR.a();
                    return;
                }
                my0Var.dismiss();
                return;
            case 5:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i2 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                d dVar = undoView.s;
                tL_payments_getPaymentReceipt.peer = dVar.getMessagesController().l1(message.peer_id);
                dVar.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new go9(undoView, (byte) 19), 2);
                return;
            case 6:
                k8c k8cVar = (k8c) this.b;
                File file = (File) this.c;
                Activity W = gm.W(k8cVar.getContext());
                if (W != null) {
                    gm.s2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    k8cVar.dismiss();
                    return;
                }
                return;
            case 7:
                t9c t9cVar = (t9c) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashSet hashSet = t9cVar.b2;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Long l = (Long) obj;
                    l.getClass();
                    hashSet.remove(l);
                    t9cVar.h2.remove(l);
                }
                t9cVar.Y0();
                t9cVar.U1.b(true, hashSet, new n9c(t9cVar, (byte) 5), null);
                t9cVar.g1(true, true);
                t9cVar.Z0();
                return;
            case 8:
                final t9c t9cVar2 = (t9c) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                bu5 G = bu5.G(t9cVar2.c, t9cVar2.J0, (View) view.getParent());
                G.b(2131232599, jb6.M0(2131745335, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        t9c t9cVar3 = t9cVar2;
                        switch (b) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = t9cVar3.r1;
                                    if (dVar2 == null) {
                                        d S = LaunchActivity.S();
                                        ?? obj2 = new Object();
                                        obj2.a = true;
                                        if (S != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.id);
                                            S.showAsSheet(new yv1(bundle), obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    dVar2.presentFragment(new yv1(bundle2));
                                    return;
                                }
                                return;
                            default:
                                if (user2 != null) {
                                    d dVar3 = t9cVar3.r1;
                                    if (dVar3 == null) {
                                        d S2 = LaunchActivity.S();
                                        if (S2 != 0) {
                                            ?? obj3 = new Object();
                                            obj3.a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle3, null), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user2.id);
                                    dVar3.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.b(2131232272, jb6.M0(2131747519, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        t9c t9cVar3 = t9cVar2;
                        switch (b) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = t9cVar3.r1;
                                    if (dVar2 == null) {
                                        d S = LaunchActivity.S();
                                        ?? obj2 = new Object();
                                        obj2.a = true;
                                        if (S != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.id);
                                            S.showAsSheet(new yv1(bundle), obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    dVar2.presentFragment(new yv1(bundle2));
                                    return;
                                }
                                return;
                            default:
                                if (user2 != null) {
                                    d dVar3 = t9cVar3.r1;
                                    if (dVar3 == null) {
                                        d S2 = LaunchActivity.S();
                                        if (S2 != 0) {
                                            ?? obj3 = new Object();
                                            obj3.a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle3, null), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user2.id);
                                    dVar3.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.a0();
                return;
            case 9:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                return;
            case 10:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                return;
            case 11:
                iic iicVar = (iic) this.b;
                Activity activity = (Activity) this.c;
                t9c t9cVar3 = iicVar.N;
                if (t9cVar3 != null) {
                    t9cVar3.dismiss();
                    iicVar.N = null;
                }
                t9c t9cVar4 = new t9c(activity, iicVar.a, new q63());
                TLRPC.User user2 = iicVar.c;
                if (user2 != null) {
                    j = user2.id;
                } else {
                    j = 0;
                }
                TLRPC.User user3 = iicVar.d;
                if (user3 != null) {
                    j2 = user3.id;
                }
                long[] jArr = {j, j2};
                for (int i3 = 0; i3 < 2; i3++) {
                    t9cVar4.s2.add(Long.valueOf(jArr[i3]));
                }
                t9cVar4.f1(false, true);
                t9cVar4.t2 = new nq0((byte) 4);
                iicVar.N = t9cVar4;
                t9cVar4.show();
                return;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                boolean z = !zArr[0];
                zArr[0] = z;
                ((oh2) this.c).c(z, true);
                return;
            case 13:
                yic yicVar = (yic) this.b;
                Context context = (Context) this.c;
                if (context instanceof LaunchActivity) {
                    if (!a.x) {
                        iic.n((Activity) context, yicVar.N);
                        return;
                    }
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                    return;
                }
                return;
            case 14:
                fnc fncVar = (fnc) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                d S = LaunchActivity.S();
                if (S != null) {
                    fncVar.dismiss();
                    asc ascVar = new asc();
                    ascVar.n0(nftitem);
                    S.presentFragment(ascVar);
                    return;
                }
                return;
            case 15:
                ((vl1) this.b).run();
                ((el7[]) this.c)[0].dismiss();
                return;
            case 16:
                oh2 oh2Var = (oh2) this.b;
                TextView textView = (TextView) this.c;
                oh2Var.c(!oh2Var.b(), true);
                if (!oh2Var.b()) {
                    i = 8;
                }
                textView.setVisibility(i);
                return;
            default:
                b61 b61Var2 = (b61) this.b;
                int[] iArr = (int[]) this.c;
                if (!b61Var2.R && (sm2Var = auc.d) != null) {
                    b61Var2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j3 = sm2Var.j();
                        z3d z3dVar = new ua4(applicationContext, b05.c).i;
                        t2e t2eVar = new t2e(z3dVar, (String) sm2Var.e, "/tg-wear-auth/answer", j3);
                        z3dVar.b.d(0, t2eVar);
                        ydd.a(t2eVar, nf5.f).addOnSuccessListener(new jq9(sm2Var, b61Var2, iArr, (byte) 16)).addOnFailureListener(new ytc(b61Var2, (byte) 0));
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        b61Var2.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}
