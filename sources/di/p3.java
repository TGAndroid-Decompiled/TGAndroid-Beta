package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import bi.k6;
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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.ea;
public final class p3 implements View.OnClickListener {
    public final int f6843a = 0;
    public final int f6844b;
    public final Object f6845c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f6846f;
    public final Object h;

    public p3(int i10, org.telegram.ui.ActionBar.h3 h3Var, f6 f6Var, LinearLayout linearLayout, long[] jArr, o3 o3Var) {
        this.f6844b = i10;
        this.d = h3Var;
        this.e = f6Var;
        this.f6845c = linearLayout;
        this.f6846f = jArr;
        this.h = o3Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        Runnable runnable;
        int i10 = this.f6843a;
        JSONObject jSONObject = null;
        int i11 = this.f6844b;
        Object obj = this.h;
        Object obj2 = this.f6846f;
        Object obj3 = this.f6845c;
        Object obj4 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) callback;
                f6 f6Var = (f6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                o3 o3Var = (o3) obj;
                xh.p g10 = xh.p.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f45849j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f45851l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                w70 F = w70.F(h3Var.getContainerView(), f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj5;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f17342id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j3 = -chat.f17195id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new a3.h0(jArr, j10, o3Var, 2));
                }
                F.f28702t = false;
                F.f28701s = 0;
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
                    duration.setInterpolator(wr.f28819f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, ak0Var2, ak0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                dd0 dd0Var = (dd0) obj3;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((dd0) callback).getValue();
                tL_birthday.month = ((dd0) obj4).getValue() + 1;
                if (dd0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = dd0Var.getValue();
                }
                runnable = c3Var.f17571a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (zh.b) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ea((sr) callback, (bi.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f6844b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) callback;
                bi.d dVar = (bi.d) obj2;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        if (c1Var != null) {
                            boolean z11 = org.telegram.ui.web.c1.P0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            c1Var.y("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new k6(15, zArr, h3Var2));
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                h3Var2.dismiss();
                return;
            default:
                bi.d dVar2 = (bi.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f17426id;
                    int i13 = this.f6844b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new fg.e1(dVar2, h3VarArr, i13, tLObject2, str, 12));
                    return;
                }
                return;
        }
    }

    public p3(bi.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, TLObject tLObject, String str) {
        this.d = dVar;
        this.e = starsSubscription;
        this.f6844b = i10;
        this.f6845c = h3VarArr;
        this.f6846f = tLObject;
        this.h = str;
    }

    public p3(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.h3 h3Var, bi.d dVar, org.telegram.ui.web.c1 c1Var, int i10) {
        this.e = tL_messages_requestUrlAuth;
        this.f6845c = zArr;
        this.d = h3Var;
        this.f6846f = dVar;
        this.h = c1Var;
        this.f6844b = i10;
    }

    public p3(sr srVar, Context context, zh.b bVar, bi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = srVar;
        this.e = context;
        this.f6845c = bVar;
        this.f6846f = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f6844b = i10;
    }

    public p3(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, int i10, org.telegram.ui.ActionBar.c3 c3Var, Utilities.Callback callback) {
        this.d = dd0Var;
        this.e = dd0Var2;
        this.f6845c = dd0Var3;
        this.f6844b = i10;
        this.f6846f = c3Var;
        this.h = callback;
    }

    public p3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, ak0 ak0Var) {
        this.d = gVar;
        this.f6844b = i10;
        this.f6845c = linearLayout;
        this.e = atomicBoolean;
        this.f6846f = horizontalScrollView;
        this.h = ak0Var;
    }
}
