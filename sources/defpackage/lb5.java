package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class lb5 {
    public static void a(he heVar, k11 k11Var, TLObject tLObject, final int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (heVar != null) {
            heVar.dismiss();
        }
        if (k11Var != null) {
            k11Var.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            oc7.r1(i).d4(groupcall.users, false);
            oc7.r1(i).X3(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.id == groupCall.id && (launchActivity = LaunchActivity.H1) != null) {
                g95.S0(launchActivity, j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            r63 r63Var = new r63();
            my0 my0Var = new my0(1, (ylb) r63Var, (Context) activity, false);
            my0Var.J();
            LinearLayout l = td4.l(activity, 1);
            l.setPadding(gm.L(14.0f), 0, gm.L(14.0f), gm.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(activity);
            int L = gm.L(80.0f);
            int i2 = cmb.Ei;
            ShapeDrawable K = cmb.K(L, cmb.v0(i2, r63Var));
            wmb M = anb.M(i2);
            frameLayout.setBackground(K);
            anb.j(frameLayout, K, M, null, r63Var);
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231094);
            frameLayout.addView(imageView, qoe.e(56, 56, 17));
            l.addView(frameLayout, qoe.t(80, 80, 1, 2, 21, 2, 13));
            int i3 = cmb.F6;
            l66 a = jxe.a(activity, 20.0f, i3, true, r63Var);
            a.setText(jb6.M0(2131749219, null));
            a.setGravity(17);
            l.addView(a, qoe.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new x00((byte) 9)).filter(new Predicate() {
                public final Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    Long l2 = (Long) obj;
                    if (l2.longValue() != z8c.h(i).e() && l2.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            l66 a2 = jxe.a(activity, 14.0f, i3, false, r63Var);
            a2.setText(gm.S2(jb6.M0(2131749225, null)));
            a2.setGravity(17);
            a2.setMaxWidth(hg5.a(a2.getText(), a2.getPaint()));
            l.addView(a2, qoe.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(activity);
                view.setBackgroundColor(-14012362);
                l.addView(view, qoe.n(0.66f, -1, 7, 0, 0, 0, 0));
                hd0 hd0Var = new hd0(activity, false);
                hd0Var.setCentered(true);
                hd0Var.setSize(gm.L(38.0f));
                int min = Math.min(3, list.size());
                hd0Var.setCount(min);
                for (int i4 = 0; i4 < min; i4++) {
                    hd0Var.b(i4, i, oc7.r1(i).W1((Long) list.get(i4)));
                }
                hd0Var.a(false);
                l.addView(hd0Var, qoe.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                l66 a3 = jxe.a(activity, 14.0f, cmb.F6, false, r63Var);
                a3.setGravity(17);
                if (list.size() == 1) {
                    a3.setText(gm.S2(jb6.a0(null, null, 2131749221, pg3.r(i, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a3.setText(gm.S2(jb6.a0(null, null, 2131749220, pg3.r(i, ((Long) list.get(0)).longValue()), pg3.r(i, ((Long) list.get(1)).longValue()))));
                } else {
                    a3.setText(gm.S2(jb6.K("GroupCallLinkText2Many", arrayList.size() - 2, ',', pg3.r(i, ((Long) list.get(0)).longValue()), pg3.r(i, ((Long) list.get(1)).longValue()))));
                }
                a3.setMaxWidth(hg5.a(a3.getText(), a3.getPaint()));
                l.addView(a3, qoe.t(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i5 = cmb.h6;
            fg0 Y = cmb.Y(cmb.v0(i5, r63Var), 20, 20);
            wmb M2 = anb.M(i5);
            linearLayout.setBackground(Y);
            anb.j(linearLayout, Y, null, M2, r63Var);
            jh2 jh2Var = new jh2(24, r63Var, activity);
            jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(oc7.d1().getBoolean("callmiconstart", true), false);
            jh2Var.setDrawBackgroundAsArc(10);
            linearLayout.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(activity);
            anb.X(textView, cmb.i5, r63Var);
            ts2.q(14.0f, 1, 2131749226, textView, null);
            linearLayout.addView(textView, qoe.t(-2, -2, 16, 9, 0, 0, 0));
            l.addView(linearLayout, qoe.t(-2, 38, 1, 0, 4, 0, 12));
            rve.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new ca5(jh2Var, (byte) 4));
            b61 b61Var = new b61(r63Var, activity, true);
            b61Var.setRoundRadius(24);
            b61Var.i(jb6.M0(2131749227, null), false, true);
            l.addView(b61Var, qoe.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            my0Var.O = l;
            b61Var.setOnClickListener(new gd2(my0Var, activity, jh2Var, i, tL_inputGroupCallSlug, (byte) 1));
            my0Var.J();
            my0Var.show();
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                d S = LaunchActivity.S();
                if (S != null) {
                    ts2.u(null, 2131748658, c41.b0(S), 2131624012, 36);
                    return;
                }
                return;
            }
            d S2 = LaunchActivity.S();
            if (S2 != null) {
                c41.b0(S2).g0(tL_error, false);
            }
        }
    }

    public static void b(Activity activity, int i, String str, k11 k11Var) {
        he heVar;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.H1) != null) {
                g95.S0(launchActivity, j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (k11Var == null) {
            he heVar2 = new he(3, null, activity);
            heVar2.q(300L);
            heVar = heVar2;
        } else {
            heVar = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new ev0(heVar, k11Var, i, activity, tL_inputGroupCallSlug, (byte) 4));
        if (k11Var != null) {
            k11Var.b = new rt2(i, sendRequest, (byte) 4);
            k11Var.d();
        }
    }
}
