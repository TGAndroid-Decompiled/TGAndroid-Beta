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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class ob5 {
    public static void a(id idVar, l01 l01Var, TLObject tLObject, final int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (idVar != null) {
            idVar.dismiss();
        }
        if (l01Var != null) {
            l01Var.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            uc7.s1(i).j4(groupcall.users, false);
            uc7.s1(i).c4(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.id == groupCall.id && (launchActivity = LaunchActivity.H1) != null) {
                j95.T0(launchActivity, k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            x53 x53Var = new x53();
            nx0 nx0Var = new nx0(1, (vnb) x53Var, (Context) activity, false);
            nx0Var.J();
            LinearLayout m = bs2.m(activity, 1);
            m.setPadding(hl.L(14.0f), 0, hl.L(14.0f), hl.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(activity);
            int L = hl.L(80.0f);
            int i2 = aob.Fi;
            ShapeDrawable K = aob.K(L, aob.v0(i2, x53Var));
            uob M = yob.M(i2);
            frameLayout.setBackground(K);
            yob.j(frameLayout, K, M, null, x53Var);
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231093);
            frameLayout.addView(imageView, tre.e(56, 56, 17));
            m.addView(frameLayout, tre.t(80, 80, 1, 2, 21, 2, 13));
            int i3 = aob.G6;
            p66 a = zze.a(activity, 20.0f, i3, true, x53Var);
            a.setText(ob6.M0(2131749216, null));
            a.setGravity(17);
            m.addView(a, tre.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new yz((byte) 9)).filter(new Predicate() {
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
                    Long l = (Long) obj;
                    if (l.longValue() != yac.h(i).e() && l.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            p66 a2 = zze.a(activity, 14.0f, i3, false, x53Var);
            a2.setText(hl.S2(ob6.M0(2131749222, null)));
            a2.setGravity(17);
            a2.setMaxWidth(kg5.a(a2.getText(), a2.getPaint()));
            m.addView(a2, tre.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(activity);
                view.setBackgroundColor(-14012362);
                m.addView(view, tre.n(0.66f, -1, 7, 0, 0, 0, 0));
                jc0 jc0Var = new jc0(activity, false);
                jc0Var.setCentered(true);
                jc0Var.setSize(hl.L(38.0f));
                int min = Math.min(3, list.size());
                jc0Var.setCount(min);
                for (int i4 = 0; i4 < min; i4++) {
                    jc0Var.b(i4, i, uc7.s1(i).X1((Long) list.get(i4)));
                }
                jc0Var.a(false);
                m.addView(jc0Var, tre.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                p66 a3 = zze.a(activity, 14.0f, aob.G6, false, x53Var);
                a3.setGravity(17);
                if (list.size() == 1) {
                    a3.setText(hl.S2(ob6.a0(null, null, 2131749218, wf3.r(i, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a3.setText(hl.S2(ob6.a0(null, null, 2131749217, wf3.r(i, ((Long) list.get(0)).longValue()), wf3.r(i, ((Long) list.get(1)).longValue()))));
                } else {
                    a3.setText(hl.S2(ob6.K("GroupCallLinkText2Many", arrayList.size() - 2, ',', wf3.r(i, ((Long) list.get(0)).longValue()), wf3.r(i, ((Long) list.get(1)).longValue()))));
                }
                a3.setMaxWidth(kg5.a(a3.getText(), a3.getPaint()));
                m.addView(a3, tre.t(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i5 = aob.i6;
            hf0 Y = aob.Y(aob.v0(i5, x53Var), 20, 20);
            uob M2 = yob.M(i5);
            linearLayout.setBackground(Y);
            yob.j(linearLayout, Y, null, M2, x53Var);
            og2 og2Var = new og2(24, x53Var, activity);
            og2Var.b(aob.h7, aob.j7, aob.k7);
            og2Var.setDrawUnchecked(true);
            og2Var.a(uc7.e1().getBoolean("callmiconstart", true), false);
            og2Var.setDrawBackgroundAsArc(10);
            linearLayout.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(activity);
            yob.X(textView, aob.j5, x53Var);
            bs2.r(14.0f, 1, 2131749223, textView, null);
            linearLayout.addView(textView, tre.t(-2, -2, 16, 9, 0, 0, 0));
            m.addView(linearLayout, tre.t(-2, 38, 1, 0, 4, 0, 12));
            iye.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new sa5(og2Var, (byte) 2));
            c51 c51Var = new c51(x53Var, activity, true);
            c51Var.setRoundRadius(24);
            c51Var.i(ob6.M0(2131749224, null), false, true);
            m.addView(c51Var, tre.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            nx0Var.O = m;
            c51Var.setOnClickListener(new lc2(nx0Var, activity, og2Var, i, tL_inputGroupCallSlug, (byte) 2));
            nx0Var.J();
            nx0Var.show();
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                e S = LaunchActivity.S();
                if (S != null) {
                    bs2.v(null, 2131748655, d31.b0(S), 2131624012, 36);
                    return;
                }
                return;
            }
            e S2 = LaunchActivity.S();
            if (S2 != null) {
                d31.b0(S2).g0(tL_error, false);
            }
        }
    }

    public static void b(Activity activity, int i, String str, l01 l01Var) {
        id idVar;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.H1) != null) {
                j95.T0(launchActivity, k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (l01Var == null) {
            id idVar2 = new id(3, null, activity);
            idVar2.q(300L);
            idVar = idVar2;
        } else {
            idVar = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new eu0(idVar, l01Var, i, activity, tL_inputGroupCallSlug, (byte) 4));
        if (l01Var != null) {
            l01Var.b = new zs2(i, sendRequest, (byte) 4);
            l01Var.d();
        }
    }
}
