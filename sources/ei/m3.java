package ei;

import ai.ya;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.da;
public final class m3 implements View.OnClickListener {
    public final int f8482a = 0;
    public final int f8483b;
    public final Object f8484c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f8485f;
    public final Object h;

    public m3(int i10, org.telegram.ui.ActionBar.e3 e3Var, d6 d6Var, LinearLayout linearLayout, long[] jArr, l3 l3Var) {
        this.f8483b = i10;
        this.d = e3Var;
        this.e = d6Var;
        this.f8484c = linearLayout;
        this.f8485f = jArr;
        this.h = l3Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        Runnable runnable;
        int i10 = this.f8482a;
        JSONObject jSONObject = null;
        int i11 = this.f8483b;
        Object obj = this.h;
        Object obj2 = this.f8485f;
        Object obj3 = this.f8484c;
        Object obj4 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) callback;
                d6 d6Var = (d6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l3 l3Var = (l3) obj;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47898j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47900l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                b80 F = b80.F(e3Var.getContainerView(), d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj5;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f18499id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j3 = -chat.f18352id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new a3.h0(jArr, j10, l3Var, 8));
                }
                F.f22873t = false;
                F.f22872s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 1:
                z4.g gVar = (z4.g) callback;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                ek0 ek0Var = (ek0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    ek0 ek0Var2 = (ek0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = ek0Var.getX() - ((horizontalScrollView.getWidth() - ek0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(tr.f28636f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, ek0Var2, ek0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                hd0 hd0Var = (hd0) obj3;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((hd0) callback).getValue();
                tL_birthday.month = ((hd0) obj4).getValue() + 1;
                if (hd0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = hd0Var.getValue();
                }
                runnable = z2Var.f19966a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (ai.d) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new da((pr) callback, (ci.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f8483b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) callback;
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        if (b1Var != null) {
                            boolean z11 = org.telegram.ui.web.b1.P0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            b1Var.z("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new ai.m0(17, zArr, e3Var2));
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                e3Var2.dismiss();
                return;
            default:
                ci.d dVar2 = (ci.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f18578id;
                    int i13 = this.f8483b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new ya(dVar2, e3VarArr, i13, tLObject2, str, 13));
                    return;
                }
                return;
        }
    }

    public m3(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, TLObject tLObject, String str) {
        this.d = dVar;
        this.e = starsSubscription;
        this.f8483b = i10;
        this.f8484c = e3VarArr;
        this.f8485f = tLObject;
        this.h = str;
    }

    public m3(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.e3 e3Var, ci.d dVar, org.telegram.ui.web.b1 b1Var, int i10) {
        this.e = tL_messages_requestUrlAuth;
        this.f8484c = zArr;
        this.d = e3Var;
        this.f8485f = dVar;
        this.h = b1Var;
        this.f8483b = i10;
    }

    public m3(pr prVar, Context context, ai.d dVar, ci.d dVar2, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = prVar;
        this.e = context;
        this.f8484c = dVar;
        this.f8485f = dVar2;
        this.h = getgroupcallstreamrtmpurl;
        this.f8483b = i10;
    }

    public m3(hd0 hd0Var, hd0 hd0Var2, hd0 hd0Var3, int i10, org.telegram.ui.ActionBar.z2 z2Var, Utilities.Callback callback) {
        this.d = hd0Var;
        this.e = hd0Var2;
        this.f8484c = hd0Var3;
        this.f8483b = i10;
        this.f8485f = z2Var;
        this.h = callback;
    }

    public m3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, ek0 ek0Var) {
        this.d = gVar;
        this.f8483b = i10;
        this.f8484c = linearLayout;
        this.e = atomicBoolean;
        this.f8485f = horizontalScrollView;
        this.h = ek0Var;
    }
}
