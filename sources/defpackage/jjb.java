package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class jjb implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public jjb(byte b, KeyEvent.Callback callback, Object obj) {
        this.a = b;
        this.c = obj;
        this.b = callback;
    }

    @Override
    public final void onClick(View view) {
        long j;
        am2 am2Var;
        long j2 = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.c;
                ((nx0) this.b).dismiss();
                if (!zArr[0]) {
                    uc7.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                xqb xqbVar = (xqb) this.b;
                Context context = (Context) this.c;
                if (xqbVar.getParentActivity() != null) {
                    z8d z8dVar = new z8d(xqbVar.getParentActivity(), (vnb) null);
                    ((nx0) z8dVar.b).w0 = false;
                    LinearLayout j3 = uh9.j(context, 1);
                    TextView textView = new TextView(context);
                    textView.setText(ob6.M0(2131752077, null));
                    qd4.w(textView, aob.j5, null, 1, 20.0f);
                    j3.addView(textView, tre.t(-1, -2, 51, 22, 12, 22, 4));
                    textView.setOnTouchListener(new vqb((byte) 0));
                    ((nx0) z8dVar.b).O = j3;
                    ArrayList arrayList = new ArrayList();
                    int size = aob.F.size();
                    while (i < size) {
                        znb znbVar = (znb) aob.F.get(i);
                        TLRPC.TL_theme tL_theme = znbVar.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList.add(znbVar);
                        }
                        i++;
                    }
                    pob pobVar = new pob(context, xqbVar, arrayList, new ArrayList(), z8dVar);
                    j3.addView(pobVar, tre.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    pobVar.B1(xqbVar.fragmentView.getMeasuredWidth());
                    xqbVar.showDialog((nx0) z8dVar.b);
                    return;
                }
                return;
            case 2:
                ((n0c) this.b).d();
                zu1 zu1Var = ((cs1) this.c).a;
                wxb e0 = wxb.e0(-zu1Var.l6, 0L);
                e0.E = zu1Var;
                zu1Var.presentFragment(e0);
                return;
            case 3:
                b4c b4cVar = (b4c) this.b;
                b4cVar.f2 = false;
                b4cVar.T0();
                ((l9c) this.c).O(true);
                b4cVar.E0();
                return;
            case 4:
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = ((w3c) this.b).s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(k43.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 5:
                as1 as1Var = (as1) this.b;
                ((n8) this.c).d(true);
                f4c.a(as1Var.getContext(), as1Var.d);
                return;
            case 6:
                c51 c51Var = (c51) this.c;
                nx0 nx0Var = (nx0) this.b;
                if (c51Var.J > 0) {
                    hl.A3(3.0f, c51Var, null);
                    yw0.APP_ERROR.a();
                    return;
                }
                nx0Var.dismiss();
                return;
            case 7:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i2 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                e eVar = undoView.s;
                tL_payments_getPaymentReceipt.peer = eVar.getMessagesController().m1(message.peer_id);
                eVar.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new yp9(undoView, (byte) 19), 2);
                return;
            case 8:
                jac jacVar = (jac) this.b;
                File file = (File) this.c;
                Activity W = hl.W(jacVar.getContext());
                if (W != null) {
                    hl.s2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    jacVar.dismiss();
                    return;
                }
                return;
            case 9:
                sbc sbcVar = (sbc) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                HashSet hashSet = sbcVar.b2;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    Long l = (Long) obj;
                    l.getClass();
                    hashSet.remove(l);
                    sbcVar.h2.remove(l);
                }
                sbcVar.Z0();
                sbcVar.U1.b(true, hashSet, new mbc(sbcVar, (byte) 5), null);
                sbcVar.h1(true, true);
                sbcVar.a1();
                return;
            case 10:
                final sbc sbcVar2 = (sbc) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                fu5 G = fu5.G(sbcVar2.c, sbcVar2.J0, (View) view.getParent());
                G.b(2131232598, ob6.M0(2131745329, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        sbc sbcVar3 = sbcVar2;
                        switch (b) {
                            case 0:
                                if (user2 != null) {
                                    e eVar2 = sbcVar3.r1;
                                    if (eVar2 == null) {
                                        e S = LaunchActivity.S();
                                        ?? obj2 = new Object();
                                        obj2.a = true;
                                        if (S != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.id);
                                            S.showAsSheet(new zu1(bundle), obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    eVar2.presentFragment(new zu1(bundle2));
                                    return;
                                }
                                return;
                            default:
                                if (user2 != null) {
                                    e eVar3 = sbcVar3.r1;
                                    if (eVar3 == null) {
                                        e S2 = LaunchActivity.S();
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
                                    eVar3.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.b(2131232271, ob6.M0(2131747513, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        sbc sbcVar3 = sbcVar2;
                        switch (b) {
                            case 0:
                                if (user2 != null) {
                                    e eVar2 = sbcVar3.r1;
                                    if (eVar2 == null) {
                                        e S = LaunchActivity.S();
                                        ?? obj2 = new Object();
                                        obj2.a = true;
                                        if (S != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.id);
                                            S.showAsSheet(new zu1(bundle), obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    eVar2.presentFragment(new zu1(bundle2));
                                    return;
                                }
                                return;
                            default:
                                if (user2 != null) {
                                    e eVar3 = sbcVar3.r1;
                                    if (eVar3 == null) {
                                        e S2 = LaunchActivity.S();
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
                                    eVar3.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.a0();
                return;
            case 11:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                return;
            case 12:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                return;
            case 13:
                mkc mkcVar = (mkc) this.b;
                Activity activity = (Activity) this.c;
                sbc sbcVar3 = mkcVar.N;
                if (sbcVar3 != null) {
                    sbcVar3.dismiss();
                    mkcVar.N = null;
                }
                sbc sbcVar4 = new sbc(activity, mkcVar.a, new w53());
                TLRPC.User user2 = mkcVar.c;
                if (user2 != null) {
                    j = user2.id;
                } else {
                    j = 0;
                }
                TLRPC.User user3 = mkcVar.d;
                if (user3 != null) {
                    j2 = user3.id;
                }
                long[] jArr = {j, j2};
                for (int i3 = 0; i3 < 2; i3++) {
                    sbcVar4.s2.add(Long.valueOf(jArr[i3]));
                }
                sbcVar4.g1(false, true);
                sbcVar4.t2 = new pp0((byte) 4);
                mkcVar.N = sbcVar4;
                sbcVar4.show();
                return;
            case 14:
                boolean[] zArr2 = (boolean[]) this.c;
                boolean z = !zArr2[0];
                zArr2[0] = z;
                ((sg2) this.b).c(z, true);
                return;
            case 15:
                dlc dlcVar = (dlc) this.b;
                Context context2 = (Context) this.c;
                if (context2 instanceof LaunchActivity) {
                    if (!a.x) {
                        mkc.n((Activity) context2, dlcVar.N);
                        return;
                    }
                    Intent intent = new Intent(context2, LaunchActivity.class);
                    intent.setAction("voip");
                    context2.startActivity(intent);
                    return;
                }
                return;
            case 16:
                tpc tpcVar = (tpc) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                e S = LaunchActivity.S();
                if (S != null) {
                    tpcVar.dismiss();
                    muc mucVar = new muc();
                    mucVar.m0(nftitem);
                    S.presentFragment(mucVar);
                    return;
                }
                return;
            case 17:
                ((wk1) this.b).run();
                ((jl7[]) this.c)[0].dismiss();
                return;
            case 18:
                sg2 sg2Var = (sg2) this.b;
                TextView textView2 = (TextView) this.c;
                sg2Var.c(!sg2Var.b(), true);
                if (!sg2Var.b()) {
                    i = 8;
                }
                textView2.setVisibility(i);
                return;
            default:
                c51 c51Var2 = (c51) this.b;
                int[] iArr = (int[]) this.c;
                if (!c51Var2.R && (am2Var = nwc.d) != null) {
                    c51Var2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] r = am2Var.r();
                        o6d o6dVar = new qa4(applicationContext, g05.c).i;
                        g5e g5eVar = new g5e(o6dVar, (String) am2Var.e, "/tg-wear-auth/answer", r);
                        o6dVar.b.d(0, g5eVar);
                        pgd.a(g5eVar, qf5.f).addOnSuccessListener(new o48(am2Var, c51Var2, iArr, (byte) 25)).addOnFailureListener(new lwc(c51Var2, (byte) 0));
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        c51Var2.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }

    public jjb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
