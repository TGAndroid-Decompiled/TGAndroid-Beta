package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;
public final class q31 implements l8c, ed, wi3, r69, r9, ub0, e39, gj, z97, yw5, s29, zz8, sc7, ResultCallback, xh5, n48, ll5, e12, vb9, vc7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public q31(ff1 ff1Var, gb2 gb2Var, TLRPC.User user) {
        this.a = (byte) 6;
        this.b = ff1Var;
        this.c = user;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        j52 j52Var = (j52) this.b;
        jm6 jm6Var = (jm6) this.c;
        if (z && !z2 && jm6Var.M && j52Var.d.n() == null) {
            if (j52Var.d.n() != null && !j52Var.d.n().isRecycled()) {
                j52Var.d.n().recycle();
                j52Var.d.g0(null);
            }
            j52Var.d.f0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, wy4 wy4Var) {
        Location location;
        c42 c42Var = (c42) this.b;
        wjb wjbVar = (wjb) this.c;
        ImageView imageView = c42Var.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = c42Var.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = c42Var.b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            c42Var.b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            c42Var.b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, c42Var.k0 - gl.L(10.0f)));
            c42Var.b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = c42Var.b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            c42Var.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            c42Var.b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            c42Var.b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, c42Var.k0));
            c42Var.b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!c42Var.m0) {
                int i = bkb.kj;
                zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i));
                c42Var.m0 = true;
            }
            ty4 ty4Var = c42Var.E;
            if (ty4Var != null && (location = c42Var.j0) != null) {
                location.setLatitude(((yh5) ty4Var.d().b).a);
                c42Var.j0.setLongitude(((yh5) c42Var.E.d().b).b);
            }
            c42Var.L.L(c42Var.j0);
        }
        return wy4Var.a(motionEvent).booleanValue();
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        ((mu1) this.b).F8((Context) this.c, tL_error);
        return false;
    }

    @Override
    public final void c(o48 o48Var) {
        int i;
        TLRPC.Chat chat;
        e52 e52Var = (e52) this.b;
        o48 o48Var2 = (o48) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = e52Var.w;
        boolean z = chatAttachAlertPhotoLayout.w0;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (z) {
            byte b = x02Var.N2;
            d dVar = x02Var.Z1;
            if (b == 0 && !x02Var.B1) {
                int intValue = ((Integer) o48Var.getTag()).intValue();
                jm6 photoEntry = o48Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.Y(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                    boolean z2 = true;
                    if (hashMap.size() + 1 > chatAttachAlertPhotoLayout.i0()) {
                        new u21(x02Var.o3, chatAttachAlertPhotoLayout.a).t(gl.S2(k96.G(dVar.getMessagesController().k4.i0.f(), "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z3 = !containsKey;
                    int i2 = 2;
                    if (!containsKey && x02Var.P3 >= 0 && hashMap.size() >= x02Var.P3) {
                        if (x02Var.Q3 && (dVar instanceof mu1) && (chat = ((mu1) dVar).e) != null && !hc2.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            ij.L(chatAttachAlertPhotoLayout.getContext(), k96.M0(2131745118, null), k96.M0(2131745111, null), null, null, chatAttachAlertPhotoLayout.a).o();
                            if (chatAttachAlertPhotoLayout.M == 1) {
                                chatAttachAlertPhotoLayout.M = (byte) 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i = ChatAttachAlertPhotoLayout.u1.size();
                    } else {
                        i = -1;
                    }
                    if ((dVar instanceof mu1) && x02Var.Q3) {
                        o48Var.b(i, z3, true);
                    } else {
                        o48Var.b(-1, z3, true);
                    }
                    chatAttachAlertPhotoLayout.R(photoEntry, intValue);
                    e52 e52Var2 = chatAttachAlertPhotoLayout.w;
                    if (e52Var == e52Var2) {
                        e52 e52Var3 = chatAttachAlertPhotoLayout.H;
                        if (e52Var3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (e52Var3.f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        e52Var3.g(intValue);
                    } else {
                        e52Var2.g(intValue);
                    }
                    if (!containsKey) {
                        i2 = 1;
                    }
                    x02Var.F1(i2);
                    o48Var2.setHasSpoiler(photoEntry.M);
                    o48Var2.setHighQuality(photoEntry.c());
                    long j = photoEntry.N;
                    if (hashMap.size() <= 1) {
                        z2 = false;
                    }
                    o48Var2.f(j, z2);
                }
            }
        }
    }

    @Override
    public final void call() {
        int i = CarAppNotificationBroadcastReceiver.a;
        ((IStartCarApp) this.b).startCarApp((Intent) this.c);
    }

    @Override
    public final boolean d(int i, View view) {
        return ((eg1) this.b).H0((Context) this.c, view, i);
    }

    @Override
    public final cs5 e(mc9 mc9Var) {
        wjb wjbVar = (wjb) this.c;
        e72 e72Var = (e72) ((tg2) this.b).c;
        cs5 cs5Var = new cs5(e72Var, wjbVar, mc9Var, false, false, true);
        e72Var.I = cs5Var;
        return cs5Var;
    }

    @Override
    public final void f() {
        ((qw4) this.c).g();
        ((mu1) this.b).I7();
    }

    @Override
    public final void g(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        p8c p8cVar = (p8c) this.b;
        x31 x31Var = (x31) this.c;
        if (!arrayList.isEmpty()) {
            p8cVar.a(new td8((k27) arrayList.get(0)));
        }
        x31Var.a(true);
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        y31 y31Var = (y31) this.b;
        y31Var.x = false;
        gl.r(y31Var.e);
        t31 t31Var = y31Var.n;
        y31Var.y = document;
        t31Var.setSticker(document);
        ((wgb) ((View) this.c)).setValueSticker(document);
        y31Var.f0(true);
    }

    @Override
    public final void i(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = (CarAppPermissionActivity) this.b;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.c;
        int i = CarAppPermissionActivity.K;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null && bool.booleanValue()) {
                arrayList.add((String) entry.getKey());
            } else {
                arrayList2.add((String) entry.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }

    @Override
    public final void j(cc0 cc0Var) {
        ff1 ff1Var = (ff1) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = cc0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                kf1 kf1Var = ff1Var.a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    d dVar = kf1Var.n;
                    if (dVar.getMessagesController().A(bundle, dVar, null, null)) {
                        dVar.presentFragment(new mu1(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ff1Var.a(user);
    }

    @Override
    public final void k(boolean z) {
        long j = ((TLRPC.User) this.c).id;
        mu1 mu1Var = ((aq1) this.b).b;
        long j2 = mu1Var.s4;
        if (j != j2) {
            return;
        }
        mu1Var.xa(j2, false);
    }

    @Override
    public final void l(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        k27 k27Var = (k27) this.c;
        mu1 mu1Var = ((vo1) this.b).p;
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("report_reaction_message_id", k27Var.e1());
        bundle.putLong("report_reaction_from_dialog_id", mu1Var.l6);
        mu1Var.presentFragment(new ProfileActivity(bundle, null));
        mu1Var.G5(true);
    }

    @Override
    public final void n(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.c;
        fa4.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public final void onComplete(Object obj) {
        ku1 ku1Var = (ku1) this.b;
        ye7 ye7Var = (ye7) this.c;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            jy3 jy3Var = ku1Var.f;
            if (jy3Var != null && longValue == jy3Var.h(ku1Var.q ? 1 : 0) && bitmap != null) {
                ye7Var.x = bitmap;
                ye7Var.i();
            }
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        v51 v51Var = (v51) this.b;
        ArrayList arrayList2 = v51Var.c;
        ((cj3) this.c).finishFragment();
        m51 m51Var = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 3;
            boolean z3 = true;
            if (i4 >= arrayList.size()) {
                break;
            }
            int i6 = 0;
            while (true) {
                if (i6 < v51Var.d.size()) {
                    if (((m51) v51Var.d.get(i6)).a == ((zc7) arrayList.get(i4)).a) {
                        m51Var = (m51) v51Var.d.get(i6);
                        break;
                    }
                    i6++;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (!z3) {
                if (v51Var.getMessagesController().h4.c(v51Var.e) != 2) {
                    i5 = 2;
                }
                ArrayList arrayList3 = v51Var.d;
                m51 m51Var2 = new m51(((zc7) arrayList.get(i4)).a, i5);
                arrayList3.add(m51Var2);
                m51Var = m51Var2;
            }
            i4++;
        }
        v51Var.getMessagesController().h4.h(v51Var.e, v51Var.d);
        v51Var.Y();
        if (m51Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < arrayList2.size()) {
                    if (((u51) arrayList2.get(i7)).c != null && ((u51) arrayList2.get(i7)).c.a == m51Var.a) {
                        i3 = i7;
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
            v51Var.b.w0(i3);
            gl.d3(new q21(v51Var, m51Var, (byte) 3), 150L);
        }
        return true;
    }

    @Override
    public final void run(long j) {
        boolean z;
        p82 p82Var = (p82) this.b;
        p82Var.getClass();
        ((hd) this.c).dismiss();
        boolean z2 = false;
        p82Var.O0 = false;
        if (j != 0) {
            p82Var.w0 = j;
            TLRPC.Chat K0 = p82Var.getMessagesController().K0(Long.valueOf(j));
            p82Var.x0 = K0;
            TLRPC.ChatFull chatFull = p82Var.y0;
            if (chatFull != null) {
                chatFull.hidden_prehistory = true;
            }
            if (K0.forum_tabs != p82Var.H0) {
                z = true;
            } else {
                z = false;
            }
            if (K0.forum_sidebar != p82Var.I0) {
                z2 = true;
            }
            p82Var.getMessagesController().g5(p82Var.w0, p82Var.F0, p82Var.H0, p82Var.I0);
            TLRPC.Chat chat = p82Var.x0;
            chat.forum = p82Var.F0;
            chat.forum_tabs = p82Var.H0;
            chat.forum_sidebar = p82Var.I0;
            if (!z && !z2) {
                return;
            }
            p82Var.u0(z);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        k27 threadMessage;
        j1a j1aVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 10:
                mu1 mu1Var = (mu1) obj2;
                mu1Var.z6();
                z3a.X(mu1Var.getAccountInstance(), (Uri) obj, mu1Var.l6, mu1Var.F5, mu1Var.m4, null, mu1Var.H5, z, i, mu1Var.Q6());
                return;
            case 12:
                mu1 mu1Var2 = (mu1) obj2;
                mu1Var2.getSendMessagesHelper().q0(x3a.b((String) obj, mu1Var2.l6, mu1Var2.F5, mu1Var2.m4, null, false, null, null, null, z, i, 0, null, false));
                mu1Var2.a0.setFieldText("");
                mu1Var2.w7(false);
                return;
            case 17:
                wt1 wt1Var = (wt1) obj2;
                k27 k27Var = (k27) obj;
                if (z) {
                    wt1Var.a.getMessagesController().s(k27Var.k.id, i, cf3.n(k27Var.k.peer_id), null, false);
                    return;
                }
                return;
            case 20:
                String str = (String) obj;
                ChatActivityEnterView chatActivityEnterView = ((dx1) obj2).a;
                long j = chatActivityEnterView.G3;
                k27 k27Var2 = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                x3a b2 = x3a.b(str, j, k27Var2, threadMessage, null, false, null, null, null, z, i, i2, null, false);
                mu1 mu1Var3 = chatActivityEnterView.F3;
                if (mu1Var3 != null) {
                    j1aVar = mu1Var3.Q6();
                } else {
                    j1aVar = null;
                }
                b2.K = j1aVar;
                b2.O = chatActivityEnterView.O6;
                z3a.B(chatActivityEnterView.R).q0(b2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                ow1 ow1Var = chatActivityEnterView.K0;
                chatActivityEnterView.O6 = 0L;
                ow1Var.setEffect(0L);
                return;
            case 21:
                ((gy1) obj2).L((gi3) obj, z, i, i2);
                return;
            default:
                k62 k62Var = (k62) obj2;
                View view = (View) obj;
                if (z) {
                    k62Var.W = i;
                    k62Var.V = 0;
                    if (view instanceof wgb) {
                        k62Var.U((wgb) view, true);
                        return;
                    } else {
                        k62Var.r.g(k62Var.J0);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                ((f41) obj2).e0((TL_account.TL_businessChatLink) obj);
                return;
            case 5:
                d01.p(((nf1) obj2).getParentActivity(), (String) obj, true);
                return;
            case 7:
                ((eg1) obj2).F0((TL_payments.connectedBotStarRef) obj);
                return;
            default:
                ((yh1) obj2).f0((TLRPC.Chat) obj);
                return;
        }
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public q31(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onError(Throwable th) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
