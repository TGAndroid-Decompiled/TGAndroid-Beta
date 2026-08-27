package hh;

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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.hj0;

public final class u8 implements View.OnClickListener {

    public final int f10174a;

    public final int f10175b;

    public final KeyEvent.Callback f10176c;
    public final Object d;

    public final Object f10177e;

    public final Object f10178f;
    public final Object h;

    public u8(int i10, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, LinearLayout linearLayout, long[] jArr, gh.e1 e1Var) {
        this.f10174a = 1;
        this.f10175b = i10;
        this.f10176c = e3Var;
        this.d = c6Var;
        this.f10177e = linearLayout;
        this.f10178f = jArr;
        this.h = e1Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        int i10 = this.f10174a;
        JSONObject jSONObject = null;
        int i11 = this.f10175b;
        Object obj = this.h;
        KeyEvent.Callback callback = this.f10176c;
        Object obj2 = this.f10178f;
        Object obj3 = this.f10177e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                lh.d dVar = (lh.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f22608id;
                    int i12 = this.f10175b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new gf.j0(dVar, e3VarArr, i12, tLObject, str, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) callback;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                gh.e1 e1Var = (gh.e1) obj;
                c0 c0VarG = c0.g(i11);
                c0VarG.n();
                c0VarG.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = c0VarG.f9056j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = c0VarG.f9058l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                b70 b70VarF = b70.F(e3Var.getContainerView(), c6Var, linearLayout);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f22527id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f22380id;
                        }
                    }
                    long j11 = j10;
                    b70VarF.g(tLObject2, j11 == jArr[0], new e5.u(jArr, j11, e1Var, 12));
                }
                b70VarF.f26993t = false;
                b70VarF.f26992s = 0;
                b70VarF.V(5);
                b70VarF.a0(AndroidUtilities.dp(24.0f), 0.0f);
                b70VarF.Z();
                break;
            case 2:
                m2.g gVar = (m2.g) callback;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                hj0 hj0Var = (hj0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    hj0 hj0Var2 = (hj0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x8 = hj0Var.getX() - ((horizontalScrollView.getWidth() - hj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(er.f28122f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x8, hj0Var2, hj0Var));
                    duration.start();
                    break;
                }
                break;
            case 3:
                fc0 fc0Var = (fc0) obj3;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((fc0) callback).getValue();
                tL_birthday.month = ((fc0) obj4).getValue() + 1;
                if (fc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = fc0Var.getValue();
                }
                z2Var.f23994a.dismissRunnable.run();
                callback2.run(tL_birthday);
                break;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (jh.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new cg.a0((ar) obj4, (lh.d) callback, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f10175b, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            default:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                lh.d dVar2 = (lh.d) callback;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar2.J) {
                        dVar2.setLoading(true);
                        if (z0Var != null) {
                            boolean z10 = org.telegram.ui.web.z0.I0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            z0Var.v("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new cg.u0(23, zArr, e3Var2));
                        break;
                    }
                } else {
                    zArr[0] = true;
                    e3Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public u8(Object obj, Object obj2, Object obj3, lh.d dVar, Object obj4, int i10, int i11) {
        this.f10174a = i11;
        this.d = obj;
        this.f10177e = obj2;
        this.f10178f = obj3;
        this.f10176c = dVar;
        this.h = obj4;
        this.f10175b = i10;
    }

    public u8(lh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, TLObject tLObject, String str) {
        this.f10174a = 0;
        this.f10176c = dVar;
        this.d = starsSubscription;
        this.f10175b = i10;
        this.f10177e = e3VarArr;
        this.f10178f = tLObject;
        this.h = str;
    }

    public u8(m2.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, hj0 hj0Var) {
        this.f10174a = 2;
        this.f10176c = gVar;
        this.f10175b = i10;
        this.d = linearLayout;
        this.f10177e = atomicBoolean;
        this.f10178f = horizontalScrollView;
        this.h = hj0Var;
    }

    public u8(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, int i10, org.telegram.ui.ActionBar.z2 z2Var, Utilities.Callback callback) {
        this.f10174a = 3;
        this.f10176c = fc0Var;
        this.d = fc0Var2;
        this.f10177e = fc0Var3;
        this.f10175b = i10;
        this.f10178f = z2Var;
        this.h = callback;
    }
}
