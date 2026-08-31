package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.jv0;
public final class s8 implements View.OnClickListener {
    public final int f14763a;
    public final int f14764b;
    public final KeyEvent.Callback f14765c;
    public final Object d;
    public final Object f14766e;
    public final Object f14767f;
    public final Object h;

    public s8(int i10, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, LinearLayout linearLayout, long[] jArr, eg.d3 d3Var) {
        this.f14763a = 5;
        this.f14764b = i10;
        this.f14765c = h3Var;
        this.d = g6Var;
        this.f14766e = linearLayout;
        this.f14767f = jArr;
        this.h = d3Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        long j10;
        boolean z4;
        int i10 = this.f14763a;
        JSONObject jSONObject = null;
        int i11 = this.f14764b;
        Object obj = this.h;
        Object obj2 = this.f14767f;
        Object obj3 = this.f14766e;
        Object obj4 = this.d;
        KeyEvent.Callback callback = this.f14765c;
        switch (i10) {
            case 0:
                qh.d dVar = (qh.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f21071id;
                    int i12 = this.f14764b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new lf.i0(dVar, h3VarArr, i12, tLObject, str, 1));
                    return;
                }
                return;
            case 1:
                m2.h hVar = (m2.h) callback;
                LinearLayout linearLayout = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                bk0 bk0Var = (bk0) obj;
                int currentItem = hVar.getCurrentItem();
                if (i11 != currentItem) {
                    bk0 bk0Var2 = (bk0) linearLayout.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    hVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = bk0Var.getX() - ((horizontalScrollView.getWidth() - bk0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(pr.f30183f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, bk0Var2, bk0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                yc0 yc0Var = (yc0) obj3;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((yc0) callback).getValue();
                tL_birthday.month = ((yc0) obj4).getValue() + 1;
                if (yc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = yc0Var.getValue();
                }
                runnable = c3Var.f21207a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (oh.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new hg.a0((lr) obj4, (qh.d) callback, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f14764b, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                qh.d dVar2 = (qh.d) callback;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar2.K) {
                        dVar2.setLoading(true);
                        if (a1Var != null) {
                            boolean z10 = org.telegram.ui.web.a1.J0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            a1Var.v("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new eh.w(22, zArr, h3Var));
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                h3Var.dismiss();
                return;
            default:
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) callback;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                eg.d3 d3Var = (eg.d3) obj;
                a0 g10 = a0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f13674j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f13676l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                q70 F = q70.F(h3Var2.getContainerView(), g6Var, linearLayout2);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f20990id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f20843id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    F.g(tLObject2, z4, new jv0(jArr, j11, d3Var, 3));
                }
                F.f30330t = false;
                F.f30329s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public s8(Object obj, Object obj2, Object obj3, qh.d dVar, Object obj4, int i10, int i11) {
        this.f14763a = i11;
        this.d = obj;
        this.f14766e = obj2;
        this.f14767f = obj3;
        this.f14765c = dVar;
        this.h = obj4;
        this.f14764b = i10;
    }

    public s8(m2.h hVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, bk0 bk0Var) {
        this.f14763a = 1;
        this.f14765c = hVar;
        this.f14764b = i10;
        this.d = linearLayout;
        this.f14766e = atomicBoolean;
        this.f14767f = horizontalScrollView;
        this.h = bk0Var;
    }

    public s8(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, int i10, org.telegram.ui.ActionBar.c3 c3Var, Utilities.Callback callback) {
        this.f14763a = 2;
        this.f14765c = yc0Var;
        this.d = yc0Var2;
        this.f14766e = yc0Var3;
        this.f14764b = i10;
        this.f14767f = c3Var;
        this.h = callback;
    }

    public s8(qh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, TLObject tLObject, String str) {
        this.f14763a = 0;
        this.f14765c = dVar;
        this.d = starsSubscription;
        this.f14764b = i10;
        this.f14766e = h3VarArr;
        this.f14767f = tLObject;
        this.h = str;
    }
}
