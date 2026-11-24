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
public final class v82 implements ed, vc7, b3c, l8, gj8, aq2, OnFailureListener, uw9, d39, y56, x56, m74, e39, OnCompleteListener, wi3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public v82(tj tjVar, Object obj, long j) {
        this.a = (byte) 17;
        this.b = tjVar;
        this.c = obj;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final Object K(gl2 gl2Var) {
        String str = (String) this.b;
        mp2 mp2Var = (mp2) this.c;
        try {
            Trace.beginSection(str);
            return mp2Var.f.K(gl2Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public final void a(wk4 wk4Var) {
        byte b = this.a;
        Object obj = this.c;
        SpannableString spannableString = (SpannableString) this.b;
        switch (b) {
            case 5:
                gl.d3(new jn1(spannableString, wk4Var, (ee2) obj, (byte) 21));
                return;
            default:
                gl.d3(new jn1(spannableString, wk4Var, (go2) obj, (byte) 22));
                return;
        }
    }

    @Override
    public final void b() {
        bd2 bd2Var = (bd2) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (bd2Var.c != null) {
            bd2Var.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            bd2Var.a();
        }
    }

    @Override
    public final void c(Object obj, gi4 gi4Var) {
        ((uj) obj).k((y54) this.c, new lv6(gi4Var, ((l93) this.b).e));
    }

    @Override
    public final boolean d(int i, View view) {
        gm gmVar;
        qx3 qx3Var = (qx3) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof ix3) || (gmVar = ((ix3) view).c) == null) {
            return false;
        }
        a8 a8Var = new a8(qx3Var.getContext(), true, true);
        a8Var.setItemHeight(48);
        a8Var.setPadding(gl.L(26.0f), 0, gl.L(26.0f), 0);
        a8Var.setText(k96.M0(2131751755, null));
        a8Var.getTextView().setTextSize(1, 14.4f);
        a8Var.getTextView().setTypeface(gl.o());
        a8Var.setOnClickListener(new xf3(qx3Var, gmVar, (byte) 7));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = qx3Var.getContext().getDrawable(2131232569).mutate();
        zkb.x(linearLayout, mutate, bkb.F8, qx3Var.J0, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(a8Var);
        m8 m8Var = new m8(linearLayout, -2, -2);
        qx3Var.A1 = m8Var;
        m8Var.setClippingEnabled(true);
        qx3Var.A1.g();
        qx3Var.A1.setInputMethodMode(2);
        qx3Var.A1.setSoftInputMode(0);
        qx3Var.A1.setOutsideTouchable(true);
        qx3Var.A1.setAnimationStyle(2131755191);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        qx3Var.A1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - gl.L(49.0f)), iArr[1] - gl.L(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 14:
                ((DataSettingsActivity) obj2).q0((Context) obj, view, i, f);
                return;
            case 22:
                ((cj3) obj2).L3((bj3) obj, view, i);
                return;
            default:
                ((FiltersSetupActivity) obj2).d0((Context) obj, view, i);
                return;
        }
    }

    @Override
    public final j74[] f(Uri uri, Map map) {
        j74 pb3Var;
        qb3 qb3Var = (qb3) this.b;
        fm4 fm4Var = (fm4) this.c;
        if (qb3Var.c.h(fm4Var)) {
            pb3Var = new pab(qb3Var.c.r(fm4Var), null);
        } else {
            pb3Var = new pb3(fm4Var);
        }
        return new j74[]{pb3Var};
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((zc2) this.b).e0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        tj tjVar = (tj) this.b;
        switch (b) {
            case 16:
                ((uj) obj).w(tjVar, (fr6) this.c);
                return;
            default:
                ((uj) obj).onRenderedFirstFrame(tjVar);
                return;
        }
    }

    @Override
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void onComplete(Task task) {
        ((FirebaseMessagingService) this.b).a((Intent) this.c);
    }

    @Override
    public final void onFailure(Exception exc) {
        String str;
        us4 rs4Var;
        String str2;
        d03 c03Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                w13 w13Var = (w13) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                exc.getClass();
                if ((exc instanceof zn) && y13.b.contains(Integer.valueOf(((zn) exc).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + exc.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            rs4Var = new pj7(str3);
                        }
                        rs4Var = new ts4(str3, (byte) 2);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            rs4Var = new vs4(str3);
                        }
                        rs4Var = new ts4(str3, (byte) 2);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        rs4Var = new rs4(str3);
                    }
                    rs4Var = new ts4(str3, (byte) 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a(cancellationSignal)) {
                    w13Var.f().execute(new v13(w13Var, rs4Var, (byte) 0));
                    return;
                }
                return;
            default:
                d23 d23Var = (d23) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                exc.getClass();
                if ((exc instanceof zn) && y13.b.contains(Integer.valueOf(((zn) exc).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + exc.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    c03Var = new b03(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    c03Var = new f03(str4);
                } else {
                    c03Var = new c03(str4, (byte) 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a(cancellationSignal2)) {
                    Executor executor = d23Var.g;
                    if (executor != null) {
                        executor.execute(new c23(d23Var, c03Var, (byte) 0));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        nt4 nt4Var = (nt4) this.b;
        String str = (String) this.c;
        nt4Var.getClass();
        long j = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j = ((zc7) arrayList.get(i3)).a;
            nt4Var.e.getSendMessagesHelper().q0(x3a.b(str, j, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        cj3Var.finishFragment();
        ym0.h(j);
        return true;
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                x92 x92Var = (x92) obj2;
                wa5 wa5Var = (wa5) obj;
                if (j != 0) {
                    x92Var.getMessagesController().g5(j, false);
                    x92Var.c0(x92Var.getMessagesController().K0(Long.valueOf(j)), wa5Var);
                    return;
                }
                return;
            default:
                t92 t92Var = (t92) obj2;
                Runnable runnable = (Runnable) obj;
                if (j != 0) {
                    x92 x92Var2 = t92Var.y.d;
                    if (x92Var2.s) {
                        x92Var2.w.set(0, x92Var2.getMessagesController().K0(Long.valueOf(j)));
                    } else {
                        x92Var2.F = j;
                        x92Var2.f = x92Var2.getMessagesController().K0(Long.valueOf(j));
                    }
                    runnable.run();
                    return;
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
        hd hdVar2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                f92 f92Var = (f92) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = na7.g1((TLRPC.Chat) obj);
                tL_channels_updateUsername.username = "";
                f92Var.getConnectionsManager().sendRequest(tL_channels_updateUsername, new q82(f92Var, (byte) 0), 64);
                return;
            case 8:
                it2 it2Var = (it2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                it2Var.getContactsController().i(arrayList, true);
                user.contact = false;
                it2Var.finishFragment();
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                rt2 rt2Var = contactsActivity.V;
                if (rt2Var != null) {
                    rt2Var.b(user2);
                    contactsActivity.V = null;
                    return;
                }
                return;
            case 10:
                ((ContactsActivity) obj2).j0((String) obj);
                return;
            case 19:
                ((hf3) obj2).n0((TLRPC.User) obj);
                return;
            case 21:
                hq6 mediaDataController = ((cj3) obj2).getMediaDataController();
                long j = ((TLRPC.User) obj).id;
                for (int i2 = 0; i2 < mediaDataController.m1.size(); i2++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i2)).peer.user_id == j) {
                        mediaDataController.m1.remove(i2);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().h1(j);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ce2((byte) 0));
                        mediaDataController.getMessagesStorage().a.c(new to6(mediaDataController, j, 2));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        return;
                    }
                }
                return;
            case 23:
                t97 t97Var = (t97) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = t97Var.a;
                cj3 cj3Var = ((ti3) obj2).b;
                cj3Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                cj3Var.getMessagesController().j4(t97Var);
                ad7 messagesStorage = cj3Var.getMessagesStorage();
                messagesStorage.a.c(new t67(messagesStorage, t97Var, (byte) 21));
                return;
            case 24:
                ((ft3) obj2).a(((ps0) obj).getText().toString().trim());
                return;
            default:
                kf4 kf4Var = (kf4) obj2;
                t97 t97Var2 = (t97) obj;
                FiltersSetupActivity filtersSetupActivity = kf4Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    hd hdVar3 = new hd(3, null, filtersSetupActivity.getParentActivity());
                    hdVar3.j0 = false;
                    hdVar3.show();
                    hdVar2 = hdVar3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = t97Var2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new en0(kf4Var, hdVar2, t97Var2, (byte) 25));
                return;
        }
    }

    public v82(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public v82(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = (byte) 9;
        this.b = contactsActivity;
        this.c = user;
    }

    private final void h(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }

    private final void j(View view, float f, float f2) {
    }
}
