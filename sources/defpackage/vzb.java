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
public final class vzb implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public vzb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onClick(View view) {
        long j;
        gl2 gl2Var;
        int i = 0;
        switch (this.a) {
            case 0:
                c0c c0cVar = (c0c) this.b;
                c0cVar.f2 = false;
                c0cVar.S0();
                ((l5c) this.c).O(true);
                c0cVar.D0();
                return;
            case 1:
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = ((xzb) this.b).s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(s33.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                mr1 mr1Var = (mr1) this.b;
                ((m8) this.c).d(true);
                g0c.a(mr1Var.getContext(), mr1Var.d);
                return;
            case 3:
                u41 u41Var = (u41) this.b;
                fx0 fx0Var = (fx0) this.c;
                if (u41Var.J > 0) {
                    gl.B3(3.0f, u41Var, null);
                    pw0.APP_ERROR.a();
                    return;
                }
                fx0Var.dismiss();
                return;
            case 4:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i2 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                d dVar = undoView.s;
                tL_payments_getPaymentReceipt.peer = dVar.getMessagesController().k1(message.peer_id);
                dVar.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new wx9(undoView, (byte) 18), 2);
                return;
            case 5:
                j6c j6cVar = (j6c) this.b;
                File file = (File) this.c;
                Activity W = gl.W(j6cVar.getContext());
                if (W != null) {
                    gl.s2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    j6cVar.dismiss();
                    return;
                }
                return;
            case 6:
                s7c s7cVar = (s7c) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashSet hashSet = s7cVar.b2;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Long l = (Long) obj;
                    l.getClass();
                    hashSet.remove(l);
                    s7cVar.h2.remove(l);
                }
                s7cVar.Y0();
                s7cVar.U1.b(true, hashSet, new m7c(s7cVar, (byte) 5), null);
                s7cVar.g1(true, true);
                s7cVar.Z0();
                return;
            case 7:
                final s7c s7cVar2 = (s7c) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                cs5 G = cs5.G(s7cVar2.c, s7cVar2.J0, (View) view.getParent());
                G.b(2131232587, k96.M0(2131745409, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        s7c s7cVar3 = s7cVar2;
                        switch (b) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = s7cVar3.r1;
                                    if (dVar2 == null) {
                                        d S = LaunchActivity.S();
                                        ?? obj2 = new Object();
                                        obj2.a = true;
                                        if (S != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.id);
                                            S.showAsSheet(new mu1(bundle), obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    dVar2.presentFragment(new mu1(bundle2));
                                    return;
                                }
                                return;
                            default:
                                if (user2 != null) {
                                    d dVar3 = s7cVar3.r1;
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
                G.b(2131232271, k96.M0(2131747593, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        s7c s7cVar3 = s7cVar2;
                        switch (b) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = s7cVar3.r1;
                                    if (dVar2 == null) {
                                        d S = LaunchActivity.S();
                                        ?? obj2 = new Object();
                                        obj2.a = true;
                                        if (S != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.id);
                                            S.showAsSheet(new mu1(bundle), obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    dVar2.presentFragment(new mu1(bundle2));
                                    return;
                                }
                                return;
                            default:
                                if (user2 != null) {
                                    d dVar3 = s7cVar3.r1;
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
            case 8:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                return;
            case 9:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                return;
            case 10:
                hgc hgcVar = (hgc) this.b;
                Activity activity = (Activity) this.c;
                s7c s7cVar3 = hgcVar.N;
                if (s7cVar3 != null) {
                    s7cVar3.dismiss();
                    hgcVar.N = null;
                }
                s7c s7cVar4 = new s7c(activity, hgcVar.a, new e53());
                TLRPC.User user2 = hgcVar.c;
                long j2 = 0;
                if (user2 != null) {
                    j = user2.id;
                } else {
                    j = 0;
                }
                TLRPC.User user3 = hgcVar.d;
                if (user3 != null) {
                    j2 = user3.id;
                }
                long[] jArr = {j, j2};
                for (int i3 = 0; i3 < 2; i3++) {
                    s7cVar4.s2.add(Long.valueOf(jArr[i3]));
                }
                s7cVar4.f1(false, true);
                s7cVar4.t2 = new np0((byte) 4);
                hgcVar.N = s7cVar4;
                s7cVar4.show();
                return;
            case 11:
                boolean[] zArr = (boolean[]) this.b;
                boolean z = !zArr[0];
                zArr[0] = z;
                ((ag2) this.c).c(z, true);
                return;
            case 12:
                xgc xgcVar = (xgc) this.b;
                Context context = (Context) this.c;
                if (context instanceof LaunchActivity) {
                    if (!a.x) {
                        hgc.n((Activity) context, xgcVar.N);
                        return;
                    }
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                    return;
                }
                return;
            case 13:
                glc glcVar = (glc) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                d S = LaunchActivity.S();
                if (S != null) {
                    glcVar.dismiss();
                    ypc ypcVar = new ypc();
                    ypcVar.m0(nftitem);
                    S.presentFragment(ypcVar);
                    return;
                }
                return;
            case 14:
                ((nk1) this.b).run();
                ((cj7[]) this.c)[0].dismiss();
                return;
            case 15:
                ag2 ag2Var = (ag2) this.b;
                TextView textView = (TextView) this.c;
                ag2Var.c(!ag2Var.b(), true);
                if (!ag2Var.b()) {
                    i = 8;
                }
                textView.setVisibility(i);
                return;
            default:
                u41 u41Var2 = (u41) this.b;
                int[] iArr = (int[]) this.c;
                if (!u41Var2.R && (gl2Var = xrc.d) != null) {
                    u41Var2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] f = gl2Var.f();
                        x1d x1dVar = new u84(applicationContext, ay4.c).i;
                        q0e q0eVar = new q0e(x1dVar, (String) gl2Var.e, "/tg-wear-auth/answer", f);
                        x1dVar.b.d(0, q0eVar);
                        wbd.a(q0eVar, pd5.f).addOnSuccessListener(new io9(gl2Var, u41Var2, iArr, (byte) 16)).addOnFailureListener(new vrc(u41Var2, (byte) 0));
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        u41Var2.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}
