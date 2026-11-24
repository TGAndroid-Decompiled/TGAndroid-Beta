package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class x92 implements xe7, ee, c5c, l8, jl8, lr2, OnFailureListener, wy9, g59, y76, x76, v84, h59, OnCompleteListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public x92(tk tkVar, Object obj, long j) {
        this.a = (byte) 18;
        this.b = tkVar;
        this.c = obj;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        String str = (String) this.b;
        xq2 xq2Var = (xq2) this.c;
        try {
            Trace.beginSection(str);
            return xq2Var.f.X(sm2Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public final void a(wm4 wm4Var) {
        byte b = this.a;
        Object obj = this.c;
        SpannableString spannableString = (SpannableString) this.b;
        switch (b) {
            case 6:
                gm.c3(new co1(spannableString, wm4Var, (pf2) obj, (byte) 23));
                return;
            default:
                gm.c3(new co1(spannableString, wm4Var, (rp2) obj, (byte) 24));
                return;
        }
    }

    @Override
    public final void b() {
        me2 me2Var = (me2) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (me2Var.c != null) {
            me2Var.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            me2Var.a();
        }
    }

    @Override
    public final void c(Object obj, lk4 lk4Var) {
        ((uk) obj).y((h74) this.c, new hi2(lk4Var, ((xa3) this.b).e));
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                ((DataSettingsActivity) obj2).r0((Context) obj, view, i, f);
                return;
            case 23:
                ((nk3) obj2).O3((mk3) obj, view, i);
                return;
            default:
                ((FiltersSetupActivity) obj2).e0((Context) obj, view, i);
                return;
        }
    }

    @Override
    public final s84[] e(Uri uri, Map map) {
        s84 bd3Var;
        cd3 cd3Var = (cd3) this.b;
        go4 go4Var = (go4) this.c;
        if (cd3Var.c.h(go4Var)) {
            bd3Var = new qcb(cd3Var.c.v(go4Var), null);
        } else {
            bd3Var = new bd3(go4Var);
        }
        return new s84[]{bd3Var};
    }

    @Override
    public final boolean g(int i, View view) {
        gn gnVar;
        az3 az3Var = (az3) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof ty3) || (gnVar = ((ty3) view).c) == null) {
            return false;
        }
        a8 a8Var = new a8(az3Var.getContext(), true, true);
        a8Var.setItemHeight(48);
        a8Var.setPadding(gm.L(26.0f), 0, gm.L(26.0f), 0);
        a8Var.setText(jb6.M0(2131751704, null));
        a8Var.getTextView().setTextSize(1, 14.4f);
        a8Var.getTextView().setTypeface(gm.o());
        a8Var.setOnClickListener(new tf3(az3Var, gnVar, (byte) 8));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = az3Var.getContext().getDrawable(2131232581).mutate();
        anb.x(linearLayout, mutate, cmb.F8, az3Var.J0, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(a8Var);
        m8 m8Var = new m8(linearLayout, -2, -2);
        az3Var.A1 = m8Var;
        m8Var.setClippingEnabled(true);
        az3Var.A1.g();
        az3Var.A1.setInputMethodMode(2);
        az3Var.A1.setSoftInputMode(0);
        az3Var.A1.setOutsideTouchable(true);
        az3Var.A1.setAnimationStyle(2131755191);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        az3Var.A1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - gm.L(49.0f)), iArr[1] - gm.L(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ke2) this.b).f0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        tk tkVar = (tk) this.b;
        switch (b) {
            case 17:
                ((uk) obj).u(tkVar, (ft6) this.c);
                return;
            default:
                ((uk) obj).onRenderedFirstFrame(tkVar);
                return;
        }
    }

    @Override
    public final void onComplete(Task task) {
        ((FirebaseMessagingService) this.b).a((Intent) this.c);
    }

    @Override
    public final void onFailure(Exception exc) {
        String str;
        vu4 su4Var;
        String str2;
        o13 n13Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                h33 h33Var = (h33) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                exc.getClass();
                if ((exc instanceof ap) && j33.b.contains(Integer.valueOf(((ap) exc).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + exc.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            su4Var = new sl7(str3);
                        }
                        su4Var = new uu4(str3, (byte) 2);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            su4Var = new wu4(str3);
                        }
                        su4Var = new uu4(str3, (byte) 2);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        su4Var = new su4(str3);
                    }
                    su4Var = new uu4(str3, (byte) 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a(cancellationSignal)) {
                    h33Var.f().execute(new g33(h33Var, su4Var, (byte) 0));
                    return;
                }
                return;
            default:
                o33 o33Var = (o33) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                exc.getClass();
                if ((exc instanceof ap) && j33.b.contains(Integer.valueOf(((ap) exc).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + exc.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    n13Var = new m13(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    n13Var = new q13(str4);
                } else {
                    n13Var = new n13(str4, (byte) 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a(cancellationSignal2)) {
                    Executor executor = o33Var.g;
                    if (executor != null) {
                        executor.execute(new n33(o33Var, n13Var, (byte) 0));
                        return;
                    } else {
                        rr5.e("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        he heVar2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                qa2 qa2Var = (qa2) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = oc7.h1((TLRPC.Chat) obj);
                tL_channels_updateUsername.username = "";
                qa2Var.getConnectionsManager().sendRequest(tL_channels_updateUsername, new ca2(qa2Var, (byte) 0), 64);
                return;
            case 9:
                tu2 tu2Var = (tu2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                tu2Var.getContactsController().i(arrayList, true);
                user.contact = false;
                tu2Var.finishFragment();
                return;
            case 10:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                cv2 cv2Var = contactsActivity.V;
                if (cv2Var != null) {
                    cv2Var.b(user2);
                    contactsActivity.V = null;
                    return;
                }
                return;
            case 11:
                ((ContactsActivity) obj2).k0((String) obj);
                return;
            case 20:
                ((ug3) obj2).o0((TLRPC.User) obj);
                return;
            case 22:
                hs6 mediaDataController = ((nk3) obj2).getMediaDataController();
                long j = ((TLRPC.User) obj).id;
                for (int i2 = 0; i2 < mediaDataController.m1.size(); i2++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i2)).peer.user_id == j) {
                        mediaDataController.m1.remove(i2);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().i1(j);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new nf2((byte) 0));
                        mediaDataController.getMessagesStorage().a.c(new tq6(mediaDataController, j, 2));
                        mediaDataController.getNotificationCenter().k(85, new Object[0]);
                        return;
                    }
                }
                return;
            case 24:
                ub7 ub7Var = (ub7) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = ub7Var.a;
                nk3 nk3Var = ((dk3) obj2).b;
                nk3Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                nk3Var.getMessagesController().m4(ub7Var);
                cf7 messagesStorage = nk3Var.getMessagesStorage();
                messagesStorage.a.c(new q87(messagesStorage, ub7Var, (byte) 22));
                return;
            case 25:
                ((pu3) obj2).a(((vc) obj).getText().toString().trim());
                return;
            default:
                lh4 lh4Var = (lh4) obj2;
                ub7 ub7Var2 = (ub7) obj;
                FiltersSetupActivity filtersSetupActivity = lh4Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    he heVar3 = new he(3, null, filtersSetupActivity.getParentActivity());
                    heVar3.j0 = false;
                    heVar3.show();
                    heVar2 = heVar3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = ub7Var2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new eo0(lh4Var, heVar2, ub7Var2, (byte) 25));
                return;
        }
    }

    @Override
    public final void run(long j) {
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ba2 ba2Var = (ba2) obj2;
                ba2Var.getClass();
                ((he) obj).dismiss();
                ba2Var.O0 = false;
                if (j != 0) {
                    ba2Var.w0 = j;
                    TLRPC.Chat L0 = ba2Var.getMessagesController().L0(Long.valueOf(j));
                    ba2Var.x0 = L0;
                    TLRPC.ChatFull chatFull = ba2Var.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (L0.forum_tabs != ba2Var.H0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (L0.forum_sidebar != ba2Var.I0) {
                        z2 = true;
                    }
                    ba2Var.getMessagesController().i5(ba2Var.w0, ba2Var.F0, ba2Var.H0, ba2Var.I0);
                    TLRPC.Chat chat = ba2Var.x0;
                    chat.forum = ba2Var.F0;
                    chat.forum_tabs = ba2Var.H0;
                    chat.forum_sidebar = ba2Var.I0;
                    if (z || z2) {
                        ba2Var.v0(z);
                        return;
                    }
                    return;
                }
                return;
            case 1:
            default:
                eb2 eb2Var = (eb2) obj2;
                Runnable runnable = (Runnable) obj;
                if (j != 0) {
                    ib2 ib2Var = eb2Var.y.d;
                    if (ib2Var.s) {
                        ib2Var.w.set(0, ib2Var.getMessagesController().L0(Long.valueOf(j)));
                    } else {
                        ib2Var.F = j;
                        ib2Var.f = ib2Var.getMessagesController().L0(Long.valueOf(j));
                    }
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ib2 ib2Var2 = (ib2) obj2;
                uc5 uc5Var = (uc5) obj;
                if (j != 0) {
                    ib2Var2.getMessagesController().j5(j, false);
                    ib2Var2.d0(ib2Var2.getMessagesController().L0(Long.valueOf(j)), uc5Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    public x92(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public x92(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = (byte) 10;
        this.b = contactsActivity;
        this.c = user;
    }

    private final void f(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }

    private final void j(View view, float f, float f2) {
    }
}
