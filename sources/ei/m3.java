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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.da;
public final class m3 implements View.OnClickListener {
    public final int f8471a = 0;
    public final int f8472b;
    public final Object f8473c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f8474f;
    public final Object h;

    public m3(int i10, org.telegram.ui.ActionBar.f3 f3Var, d6 d6Var, LinearLayout linearLayout, long[] jArr, l3 l3Var) {
        this.f8472b = i10;
        this.d = f3Var;
        this.e = d6Var;
        this.f8473c = linearLayout;
        this.f8474f = jArr;
        this.h = l3Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        Runnable runnable;
        int i10 = this.f8471a;
        JSONObject jSONObject = null;
        int i11 = this.f8472b;
        Object obj = this.h;
        Object obj2 = this.f8474f;
        Object obj3 = this.f8473c;
        Object obj4 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) callback;
                d6 d6Var = (d6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l3 l3Var = (l3) obj;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47480j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47482l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                o70 F = o70.F(f3Var.getContainerView(), d6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj5;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f18230id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j3 = -chat.f18083id;
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
                F.f26670t = false;
                F.f26669s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 1:
                z4.g gVar = (z4.g) callback;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                rj0 rj0Var = (rj0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    rj0 rj0Var2 = (rj0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = rj0Var.getX() - ((horizontalScrollView.getWidth() - rj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(rr.f27701f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, rj0Var2, rj0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                tc0 tc0Var = (tc0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((tc0) callback).getValue();
                tL_birthday.month = ((tc0) obj4).getValue() + 1;
                if (tc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = tc0Var.getValue();
                }
                runnable = a3Var.f18414a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (ai.d) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new da((nr) callback, (ci.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f8472b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) callback;
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
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new ai.m0(17, zArr, f3Var2));
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                f3Var2.dismiss();
                return;
            default:
                ci.d dVar2 = (ci.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f18309id;
                    int i13 = this.f8472b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new ya(dVar2, f3VarArr, i13, tLObject2, str, 13));
                    return;
                }
                return;
        }
    }

    public m3(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.d = dVar;
        this.e = starsSubscription;
        this.f8472b = i10;
        this.f8473c = f3VarArr;
        this.f8474f = tLObject;
        this.h = str;
    }

    public m3(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.f3 f3Var, ci.d dVar, org.telegram.ui.web.b1 b1Var, int i10) {
        this.e = tL_messages_requestUrlAuth;
        this.f8473c = zArr;
        this.d = f3Var;
        this.f8474f = dVar;
        this.h = b1Var;
        this.f8472b = i10;
    }

    public m3(nr nrVar, Context context, ai.d dVar, ci.d dVar2, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = nrVar;
        this.e = context;
        this.f8473c = dVar;
        this.f8474f = dVar2;
        this.h = getgroupcallstreamrtmpurl;
        this.f8472b = i10;
    }

    public m3(tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, int i10, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.d = tc0Var;
        this.e = tc0Var2;
        this.f8473c = tc0Var3;
        this.f8472b = i10;
        this.f8474f = a3Var;
        this.h = callback;
    }

    public m3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, rj0 rj0Var) {
        this.d = gVar;
        this.f8472b = i10;
        this.f8473c = linearLayout;
        this.e = atomicBoolean;
        this.f8474f = horizontalScrollView;
        this.h = rj0Var;
    }
}
