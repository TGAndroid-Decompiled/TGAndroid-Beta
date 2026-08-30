package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.hv0;
public final class s8 implements View.OnClickListener {
    public final int f13093a;
    public final int f13094b;
    public final KeyEvent.Callback f13095c;
    public final Object d;
    public final Object e;
    public final Object f13096f;
    public final Object h;

    public s8(int i10, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, LinearLayout linearLayout, long[] jArr, dg.f3 f3Var) {
        this.f13093a = 5;
        this.f13094b = i10;
        this.f13095c = g3Var;
        this.d = f6Var;
        this.e = linearLayout;
        this.f13096f = jArr;
        this.h = f3Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        long j10;
        boolean z4;
        int i10 = this.f13093a;
        JSONObject jSONObject = null;
        int i11 = this.f13094b;
        Object obj = this.h;
        Object obj2 = this.f13096f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        KeyEvent.Callback callback = this.f13095c;
        switch (i10) {
            case 0:
                ph.d dVar = (ph.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f19410id;
                    int i12 = this.f13094b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new lf.i0(dVar, g3VarArr, i12, tLObject, str, 1));
                    return;
                }
                return;
            case 1:
                m2.h hVar = (m2.h) callback;
                LinearLayout linearLayout = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                zj0 zj0Var = (zj0) obj;
                int currentItem = hVar.getCurrentItem();
                if (i11 != currentItem) {
                    zj0 zj0Var2 = (zj0) linearLayout.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    hVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = zj0Var.getX() - ((horizontalScrollView.getWidth() - zj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(nr.f27346f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, zj0Var2, zj0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                wc0 wc0Var = (wc0) obj3;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((wc0) callback).getValue();
                tL_birthday.month = ((wc0) obj4).getValue() + 1;
                if (wc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = wc0Var.getValue();
                }
                runnable = b3Var.f19525a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (nh.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new gg.a0((jr) obj4, (ph.d) callback, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f13094b, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                ph.d dVar2 = (ph.d) callback;
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
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new dh.v(22, zArr, g3Var));
                        return;
                    }
                    return;
                }
                zArr[0] = true;
                g3Var.dismiss();
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) callback;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                dg.f3 f3Var = (dg.f3) obj;
                b0 g10 = b0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f12137j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f12139l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                o70 F = o70.F(g3Var2.getContainerView(), f6Var, linearLayout2);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f19331id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f19184id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    F.g(tLObject2, z4, new hv0(jArr, j11, f3Var, 2));
                }
                F.f27490t = false;
                F.f27489s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public s8(Object obj, Object obj2, Object obj3, ph.d dVar, Object obj4, int i10, int i11) {
        this.f13093a = i11;
        this.d = obj;
        this.e = obj2;
        this.f13096f = obj3;
        this.f13095c = dVar;
        this.h = obj4;
        this.f13094b = i10;
    }

    public s8(m2.h hVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, zj0 zj0Var) {
        this.f13093a = 1;
        this.f13095c = hVar;
        this.f13094b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f13096f = horizontalScrollView;
        this.h = zj0Var;
    }

    public s8(wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3, int i10, org.telegram.ui.ActionBar.b3 b3Var, Utilities.Callback callback) {
        this.f13093a = 2;
        this.f13095c = wc0Var;
        this.d = wc0Var2;
        this.e = wc0Var3;
        this.f13094b = i10;
        this.f13096f = b3Var;
        this.h = callback;
    }

    public s8(ph.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.g3[] g3VarArr, TLObject tLObject, String str) {
        this.f13093a = 0;
        this.f13095c = dVar;
        this.d = starsSubscription;
        this.f13094b = i10;
        this.e = g3VarArr;
        this.f13096f = tLObject;
        this.h = str;
    }
}
