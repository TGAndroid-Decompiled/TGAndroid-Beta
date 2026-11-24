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
public abstract class n95 {
    public static void a(hd hdVar, c01 c01Var, TLObject tLObject, final int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (hdVar != null) {
            hdVar.dismiss();
        }
        if (c01Var != null) {
            c01Var.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            na7.q1(i).a4(groupcall.users, false);
            na7.q1(i).U3(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.id == groupCall.id && (launchActivity = LaunchActivity.H1) != null) {
                h75.S0(launchActivity, j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            f53 f53Var = new f53();
            fx0 fx0Var = new fx0(1, (wjb) f53Var, (Context) activity, false);
            fx0Var.K();
            LinearLayout m = ir2.m(activity, 1);
            m.setPadding(gl.L(14.0f), 0, gl.L(14.0f), gl.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(activity);
            int L = gl.L(80.0f);
            int i2 = bkb.Ei;
            ShapeDrawable K = bkb.K(L, bkb.v0(i2, f53Var));
            vkb M = zkb.M(i2);
            frameLayout.setBackground(K);
            zkb.j(frameLayout, K, M, null, f53Var);
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231093);
            frameLayout.addView(imageView, nme.e(56, 56, 17));
            m.addView(frameLayout, nme.t(80, 80, 1, 2, 21, 2, 13));
            int i3 = bkb.F6;
            l46 a = hve.a(activity, 20.0f, i3, true, f53Var);
            a.setText(k96.M0(2131749270, null));
            a.setGravity(17);
            m.addView(a, nme.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new xz((byte) 9)).filter(new Predicate() {
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
                    if (l.longValue() != y6c.h(i).e() && l.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            l46 a2 = hve.a(activity, 14.0f, i3, false, f53Var);
            a2.setText(gl.T2(k96.M0(2131749276, null)));
            a2.setGravity(17);
            a2.setMaxWidth(je5.a(a2.getText(), a2.getPaint()));
            m.addView(a2, nme.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(activity);
                view.setBackgroundColor(-14012362);
                m.addView(view, nme.n(0.66f, -1, 7, 0, 0, 0, 0));
                hc0 hc0Var = new hc0(activity, false);
                hc0Var.setCentered(true);
                hc0Var.setSize(gl.L(38.0f));
                int min = Math.min(3, list.size());
                hc0Var.setCount(min);
                for (int i4 = 0; i4 < min; i4++) {
                    hc0Var.b(i4, i, na7.q1(i).V1((Long) list.get(i4)));
                }
                hc0Var.a(false);
                m.addView(hc0Var, nme.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                l46 a3 = hve.a(activity, 14.0f, bkb.F6, false, f53Var);
                a3.setGravity(17);
                if (list.size() == 1) {
                    a3.setText(gl.T2(k96.a0(null, null, 2131749272, cf3.r(i, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a3.setText(gl.T2(k96.a0(null, null, 2131749271, cf3.r(i, ((Long) list.get(0)).longValue()), cf3.r(i, ((Long) list.get(1)).longValue()))));
                } else {
                    a3.setText(gl.T2(k96.K("GroupCallLinkText2Many", arrayList.size() - 2, ',', cf3.r(i, ((Long) list.get(0)).longValue()), cf3.r(i, ((Long) list.get(1)).longValue()))));
                }
                a3.setMaxWidth(je5.a(a3.getText(), a3.getPaint()));
                m.addView(a3, nme.t(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i5 = bkb.h6;
            ff0 Y = bkb.Y(bkb.v0(i5, f53Var), 20, 20);
            vkb M2 = zkb.M(i5);
            linearLayout.setBackground(Y);
            zkb.j(linearLayout, Y, null, M2, f53Var);
            wf2 wf2Var = new wf2(24, f53Var, activity);
            wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(na7.c1().getBoolean("callmiconstart", true), false);
            wf2Var.setDrawBackgroundAsArc(10);
            linearLayout.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(activity);
            zkb.X(textView, bkb.i5, f53Var);
            ir2.r(14.0f, 1, 2131749277, textView, null);
            linearLayout.addView(textView, nme.t(-2, -2, 16, 9, 0, 0, 0));
            m.addView(linearLayout, nme.t(-2, 38, 1, 0, 4, 0, 12));
            ote.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new b95(wf2Var, (byte) 1));
            u41 u41Var = new u41(f53Var, activity, true);
            u41Var.setRoundRadius(24);
            u41Var.i(k96.M0(2131749278, null), false, true);
            m.addView(u41Var, nme.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            fx0Var.O = m;
            u41Var.setOnClickListener(new vb2(fx0Var, activity, wf2Var, i, tL_inputGroupCallSlug, (byte) 1));
            fx0Var.K();
            fx0Var.show();
        } else if (tL_error != null) {
            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                d S = LaunchActivity.S();
                if (S != null) {
                    ir2.v(null, 2131748709, u21.b0(S), 2131624012, 36);
                    return;
                }
                return;
            }
            d S2 = LaunchActivity.S();
            if (S2 != null) {
                u21.b0(S2).g0(tL_error, false);
            }
        }
    }

    public static void b(Activity activity, int i, String str, c01 c01Var) {
        hd hdVar;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.H1) != null) {
                h75.S0(launchActivity, j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (c01Var == null) {
            hd hdVar2 = new hd(3, null, activity);
            hdVar2.q(300L);
            hdVar = hdVar2;
        } else {
            hdVar = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new vt0(hdVar, c01Var, i, activity, tL_inputGroupCallSlug, (byte) 4));
        if (c01Var != null) {
            c01Var.b = new gs2(i, sendRequest, (byte) 4);
            c01Var.d();
        }
    }
}
