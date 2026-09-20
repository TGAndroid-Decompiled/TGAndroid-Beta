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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v70;
import org.telegram.ui.ea;
public final class m3 implements View.OnClickListener {
    public final int f8488a = 0;
    public final int f8489b;
    public final Object f8490c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f8491f;
    public final Object h;

    public m3(int i10, org.telegram.ui.ActionBar.f3 f3Var, f6 f6Var, LinearLayout linearLayout, long[] jArr, l3 l3Var) {
        this.f8489b = i10;
        this.d = f3Var;
        this.e = f6Var;
        this.f8490c = linearLayout;
        this.f8491f = jArr;
        this.h = l3Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        Runnable runnable;
        int i10 = this.f8488a;
        JSONObject jSONObject = null;
        int i11 = this.f8489b;
        Object obj = this.h;
        Object obj2 = this.f8491f;
        Object obj3 = this.f8490c;
        Object obj4 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) callback;
                f6 f6Var = (f6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l3 l3Var = (l3) obj;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47833j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47835l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                v70 F = v70.F(f3Var.getContainerView(), f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj5;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f18475id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j3 = -chat.f18328id;
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
                F.f28995t = false;
                F.f28994s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 1:
                z4.g gVar = (z4.g) callback;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                ak0 ak0Var = (ak0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    ak0 ak0Var2 = (ak0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = ak0Var.getX() - ((horizontalScrollView.getWidth() - ak0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(qr.f27642f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, ak0Var2, ak0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                cd0 cd0Var = (cd0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((cd0) callback).getValue();
                tL_birthday.month = ((cd0) obj4).getValue() + 1;
                if (cd0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = cd0Var.getValue();
                }
                runnable = a3Var.f18659a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (ai.d) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ea((mr) callback, (ci.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f8489b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) callback;
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        if (d1Var != null) {
                            boolean z11 = org.telegram.ui.web.d1.P0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            d1Var.z("oauth_result_failed", jSONObject);
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
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f18554id;
                    int i13 = this.f8489b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new ya(dVar2, f3VarArr, i13, tLObject2, str, 13));
                    return;
                }
                return;
        }
    }

    public m3(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.d = dVar;
        this.e = starsSubscription;
        this.f8489b = i10;
        this.f8490c = f3VarArr;
        this.f8491f = tLObject;
        this.h = str;
    }

    public m3(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.f3 f3Var, ci.d dVar, org.telegram.ui.web.d1 d1Var, int i10) {
        this.e = tL_messages_requestUrlAuth;
        this.f8490c = zArr;
        this.d = f3Var;
        this.f8491f = dVar;
        this.h = d1Var;
        this.f8489b = i10;
    }

    public m3(mr mrVar, Context context, ai.d dVar, ci.d dVar2, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = mrVar;
        this.e = context;
        this.f8490c = dVar;
        this.f8491f = dVar2;
        this.h = getgroupcallstreamrtmpurl;
        this.f8489b = i10;
    }

    public m3(cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3, int i10, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.d = cd0Var;
        this.e = cd0Var2;
        this.f8490c = cd0Var3;
        this.f8489b = i10;
        this.f8491f = a3Var;
        this.h = callback;
    }

    public m3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, ak0 ak0Var) {
        this.d = gVar;
        this.f8489b = i10;
        this.f8490c = linearLayout;
        this.e = atomicBoolean;
        this.f8491f = horizontalScrollView;
        this.h = ak0Var;
    }
}
