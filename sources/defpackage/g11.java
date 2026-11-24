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
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;
public final class g11 implements RequestDelegateTimestamp, mac, ee, hk3, t89, r9, uc0, h59, gk, ac7, yy5, v49, b29, ue7, ResultCallback, wj5, p68, ln5, p22, vd9 {
    public final byte a;
    public final Object b;
    public final Object c;

    public g11(ng1 ng1Var, rc2 rc2Var, TLRPC.User user) {
        this.a = (byte) 7;
        this.b = ng1Var;
        this.c = user;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, v05 v05Var) {
        Location location;
        n52 n52Var = (n52) this.b;
        ylb ylbVar = (ylb) this.c;
        ImageView imageView = n52Var.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = n52Var.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = n52Var.b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            n52Var.b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            n52Var.b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, n52Var.k0 - gm.L(10.0f)));
            n52Var.b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = n52Var.b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            n52Var.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            n52Var.b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            n52Var.b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, n52Var.k0));
            n52Var.b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!n52Var.m0) {
                int i = cmb.kj;
                anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i));
                n52Var.m0 = true;
            }
            s05 s05Var = n52Var.E;
            if (s05Var != null && (location = n52Var.j0) != null) {
                location.setLatitude(((xj5) s05Var.d().b).a);
                n52Var.j0.setLongitude(((xj5) n52Var.E.d().b).b);
            }
            n52Var.L.L(n52Var.j0);
        }
        return v05Var.a(motionEvent).booleanValue();
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        ((yv1) this.b).P8((Context) this.c, tL_error);
        return false;
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        u62 u62Var = (u62) this.b;
        jo6 jo6Var = (jo6) this.c;
        if (z && !z2 && jo6Var.M && u62Var.d.n() == null) {
            if (u62Var.d.n() != null && !u62Var.d.n().isRecycled()) {
                u62Var.d.n().recycle();
                u62Var.d.g0(null);
            }
            u62Var.d.f0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override
    public final void c(q68 q68Var) {
        int i;
        TLRPC.Chat chat;
        p62 p62Var = (p62) this.b;
        q68 q68Var2 = (q68) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = p62Var.w;
        boolean z = chatAttachAlertPhotoLayout.w0;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (z) {
            byte b = i22Var.N2;
            d dVar = i22Var.Z1;
            if (b == 0 && !i22Var.B1) {
                int intValue = ((Integer) q68Var.getTag()).intValue();
                jo6 photoEntry = q68Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.Y(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                    boolean z2 = true;
                    if (hashMap.size() + 1 > chatAttachAlertPhotoLayout.i0()) {
                        new c41(i22Var.o3, chatAttachAlertPhotoLayout.a).t(gm.S2(jb6.G(dVar.getMessagesController().l4.i0.f(), "BusinessRepliesToastLimit", new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
                    boolean z3 = !containsKey;
                    int i2 = 2;
                    if (!containsKey && i22Var.P3 >= 0 && hashMap.size() >= i22Var.P3) {
                        if (i22Var.Q3 && (dVar instanceof yv1) && (chat = ((yv1) dVar).e) != null && !sd2.N(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.M != 2) {
                            ik.L(chatAttachAlertPhotoLayout.getContext(), jb6.M0(2131745044, null), jb6.M0(2131745037, null), null, null, chatAttachAlertPhotoLayout.a).o();
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
                    if ((dVar instanceof yv1) && i22Var.Q3) {
                        q68Var.b(i, z3, true);
                    } else {
                        q68Var.b(-1, z3, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    p62 p62Var2 = chatAttachAlertPhotoLayout.w;
                    if (p62Var == p62Var2) {
                        p62 p62Var3 = chatAttachAlertPhotoLayout.H;
                        if (p62Var3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            intValue++;
                        }
                        if (p62Var3.f && intValue >= chatAttachAlertPhotoLayout.N0) {
                            intValue++;
                        }
                        p62Var3.g(intValue);
                    } else {
                        p62Var2.g(intValue);
                    }
                    if (!containsKey) {
                        i2 = 1;
                    }
                    i22Var.F1(i2);
                    q68Var2.setHasSpoiler(photoEntry.M);
                    q68Var2.setHighQuality(photoEntry.c());
                    long j = photoEntry.N;
                    if (hashMap.size() <= 1) {
                        z2 = false;
                    }
                    q68Var2.f(j, z2);
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
    public final bu5 d(ne9 ne9Var) {
        ylb ylbVar = (ylb) this.c;
        p82 p82Var = (p82) ((lx6) this.b).c;
        bu5 bu5Var = new bu5(p82Var, ylbVar, ne9Var, false, false, true);
        p82Var.I = bu5Var;
        return bu5Var;
    }

    @Override
    public final void e() {
        ((sy4) this.c).g();
        ((yv1) this.b).Q7();
    }

    @Override
    public final void f(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        qac qacVar = (qac) this.b;
        e51 e51Var = (e51) this.c;
        if (!arrayList.isEmpty()) {
            qacVar.a(new vf8((k47) arrayList.get(0)));
        }
        e51Var.a(true);
    }

    @Override
    public final boolean g(int i, View view) {
        return ((mh1) this.b).I0((Context) this.c, view, i);
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        f51 f51Var = (f51) this.b;
        f51Var.x = false;
        gm.r(f51Var.e);
        a51 a51Var = f51Var.n;
        f51Var.y = document;
        a51Var.setSticker(document);
        ((xib) ((View) this.c)).setValueSticker(document);
        f51Var.g0(true);
    }

    @Override
    public final void i(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        k47 k47Var = (k47) this.c;
        yv1 yv1Var = ((iq1) this.b).p;
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("report_reaction_message_id", k47Var.e1());
        bundle.putLong("report_reaction_from_dialog_id", yv1Var.l6);
        yv1Var.presentFragment(new ProfileActivity(bundle, null));
        yv1Var.N5(true);
    }

    @Override
    public final void j(cd0 cd0Var) {
        ng1 ng1Var = (ng1) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = cd0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                sg1 sg1Var = ng1Var.a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    d dVar = sg1Var.n;
                    if (dVar.getMessagesController().A(bundle, dVar, null, null)) {
                        dVar.presentFragment(new yv1(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ng1Var.a(user);
    }

    @Override
    public final void m(Object obj) {
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
    public final void o(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.c;
        fc4.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public final void onComplete(Object obj) {
        wv1 wv1Var = (wv1) this.b;
        ah7 ah7Var = (ah7) this.c;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            tz3 tz3Var = wv1Var.f;
            if (tz3Var != null && longValue == tz3Var.h(wv1Var.q ? 1 : 0) && bitmap != null) {
                ah7Var.x = bitmap;
                ah7Var.i();
            }
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        c71 c71Var = (c71) this.b;
        ArrayList arrayList2 = c71Var.c;
        ((nk3) this.c).finishFragment();
        t61 t61Var = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= arrayList.size()) {
                break;
            }
            int i5 = 0;
            while (true) {
                if (i5 < c71Var.d.size()) {
                    if (((t61) c71Var.d.get(i5)).a == ((bf7) arrayList.get(i4)).a) {
                        t61Var = (t61) c71Var.d.get(i5);
                        break;
                    }
                    i5++;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (!z3) {
                int i6 = 2;
                if (c71Var.getMessagesController().h4.c(c71Var.e) == 2) {
                    i6 = 3;
                }
                ArrayList arrayList3 = c71Var.d;
                t61 t61Var2 = new t61(((bf7) arrayList.get(i4)).a, i6);
                arrayList3.add(t61Var2);
                t61Var = t61Var2;
            }
            i4++;
        }
        c71Var.getMessagesController().h4.h(c71Var.e, c71Var.d);
        c71Var.Z();
        if (t61Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 < arrayList2.size()) {
                    if (((b71) arrayList2.get(i7)).c != null && ((b71) arrayList2.get(i7)).c.a == t61Var.a) {
                        i3 = i7;
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
            c71Var.b.w0(i3);
            gm.d3(new y31(c71Var, t61Var, (byte) 4), 150L);
        }
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                ((m51) obj2).f0((TL_account.TL_businessChatLink) obj);
                return;
            case 6:
                l11.q(((vg1) obj2).getParentActivity(), (String) obj, true);
                return;
            case 8:
                ((mh1) obj2).G0((TL_payments.connectedBotStarRef) obj);
                return;
            default:
                ((fj1) obj2).g0((TLRPC.Chat) obj);
                return;
        }
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        n01 n01Var;
        n01 n01Var2;
        int i;
        h11 h11Var = (h11) this.b;
        o01 o01Var = (o01) this.c;
        if (tLObject instanceof TLRPC.TL_upload_file) {
            TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
            NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
            if (nativeByteBuffer != null) {
                i = nativeByteBuffer.limit();
            } else {
                i = 0;
            }
            byte[] bArr = new byte[i];
            if (i > 0) {
                tL_upload_file.bytes.position(0);
                tL_upload_file.bytes.readBytes(bArr, false);
            }
            n01Var2 = new n01(j, bArr, 0, i);
        } else {
            if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                n01Var = new n01(j, null, 1, 0);
            } else {
                String str = (tL_error == null || (str = tL_error.text) == null) ? "" : "";
                if (!str.startsWith("FLOOD_WAIT") && !"TIME_TOO_BIG".equals(str)) {
                    if ("GROUPCALL_JOIN_MISSING".equals(str)) {
                        n01Var2 = new n01(0L, null, 3, 0);
                    } else {
                        n01Var = new n01(j, null, 2, 0);
                    }
                } else {
                    n01Var = new n01(j, null, 1, 0);
                }
            }
            n01Var2 = n01Var;
        }
        h11Var.e.execute(new x30(o01Var, n01Var2, (byte) 28));
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        k47 threadMessage;
        l3a l3aVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                yv1 yv1Var = (yv1) obj2;
                yv1Var.G6();
                a6a.X(yv1Var.getAccountInstance(), (Uri) obj, yv1Var.l6, yv1Var.F5, yv1Var.m4, null, yv1Var.H5, z, i, yv1Var.X6());
                return;
            case 13:
                yv1 yv1Var2 = (yv1) obj2;
                yv1Var2.getSendMessagesHelper().q0(y5a.b((String) obj, yv1Var2.l6, yv1Var2.F5, yv1Var2.m4, null, false, null, null, null, z, i, 0, null, false));
                yv1Var2.a0.setFieldText("");
                yv1Var2.E7(false);
                return;
            case 18:
                iv1 iv1Var = (iv1) obj2;
                k47 k47Var = (k47) obj;
                if (z) {
                    iv1Var.a.getMessagesController().s(k47Var.k.id, i, pg3.n(k47Var.k.peer_id), null, false);
                    return;
                }
                return;
            case 21:
                String str = (String) obj;
                ChatActivityEnterView chatActivityEnterView = ((ry1) obj2).a;
                long j = chatActivityEnterView.G3;
                k47 k47Var2 = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                y5a b2 = y5a.b(str, j, k47Var2, threadMessage, null, false, null, null, null, z, i, i2, null, false);
                yv1 yv1Var3 = chatActivityEnterView.F3;
                if (yv1Var3 != null) {
                    l3aVar = yv1Var3.X6();
                } else {
                    l3aVar = null;
                }
                b2.K = l3aVar;
                b2.O = chatActivityEnterView.W6;
                a6a.B(chatActivityEnterView.R).q0(b2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                by1 by1Var = chatActivityEnterView.K0;
                chatActivityEnterView.W6 = 0L;
                by1Var.setEffect(0L);
                return;
            case 22:
                ((tz1) obj2).L((lj4) obj, z, i, i2);
                return;
            default:
                v72 v72Var = (v72) obj2;
                View view = (View) obj;
                if (z) {
                    v72Var.W = i;
                    v72Var.V = 0;
                    if (view instanceof xib) {
                        v72Var.T((xib) view, true);
                        return;
                    } else {
                        v72Var.r.g(v72Var.J0);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void z(boolean z) {
        long j = ((TLRPC.User) this.c).id;
        yv1 yv1Var = ((nr1) this.b).b;
        long j2 = yv1Var.s4;
        if (j != j2) {
            return;
        }
        yv1Var.Ha(j2, false);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public g11(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void onError(Throwable th) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
