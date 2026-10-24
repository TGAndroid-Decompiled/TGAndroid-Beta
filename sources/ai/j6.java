package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.qf0;
import org.telegram.ui.xm0;
import org.telegram.ui.yq0;
import org.telegram.ui.zm0;
public final class j6 implements org.telegram.ui.ActionBar.z1, md0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final int f1546a;
    public final int f1547b;
    public final Object f1548c;
    public final Object d;
    public final Object e;
    public final Object f1549f;

    public j6(int i10, od0 od0Var, org.telegram.ui.Components.c4 c4Var, org.telegram.ui.Components.d4 d4Var, TextView textView) {
        this.f1546a = 1;
        this.f1547b = i10;
        this.f1548c = od0Var;
        this.d = c4Var;
        this.e = d4Var;
        this.f1549f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ag.a aVar;
        switch (this.f1546a) {
            case 0:
                l6 l6Var = (l6) this.f1548c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f1549f;
                i6 i6Var = (i6) l6Var.f1706o.get(l6Var.f1708q);
                if (i6Var != null) {
                    ag.a aVar2 = i6Var.f1479c;
                    ha x10 = ha.x(this.f1547b, l6Var.f1708q);
                    if (x10.e) {
                        aVar = ag.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f632b > aVar.f632b) {
                        ag.b bVar = l6Var.f1708q;
                        if (bVar == ag.b.f633a) {
                            new dd(context, g6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == ag.b.f634b) {
                            new fi.f(context, g6Var, i6Var.f1479c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    pf.c cVar = l6Var.f1705n;
                    if (cVar != null) {
                        cVar.a(false);
                        l6Var.f1705n = null;
                    }
                    callback2.run(i6Var, c2Var.h(i10, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.d;
                xm0 xm0Var = (xm0) this.e;
                zm0.Z(this.f1547b, (String) this.f1549f, secureDocument, xm0Var, (zm0) this.f1548c);
                return;
        }
    }

    @Override
    public void n(od0 od0Var, int i10) {
        od0 od0Var2 = (od0) this.f1548c;
        org.telegram.ui.Components.c4 c4Var = (org.telegram.ui.Components.c4) this.d;
        org.telegram.ui.Components.d4 d4Var = (org.telegram.ui.Components.d4) this.e;
        org.telegram.ui.Components.d5.g(null, null, 0L, this.f1547b, 3, od0Var2, c4Var, d4Var);
        org.telegram.ui.Components.d5.e((TextView) this.f1549f, od0Var2, c4Var, d4Var);
    }

    @Override
    public void onFailure(Exception exc) {
        rg.o2 o2Var = (rg.o2) this.f1548c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f1547b;
        yq0 yq0Var = (yq0) this.e;
        gi.g4 g4Var = (gi.g4) this.f1549f;
        o2Var.f46009x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new ez0(o2Var, bitmap, i10, yq0Var, 21), 2000L);
        } else {
            g4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((qf0) this.f1548c, (String) this.d, iVar, list, (String) this.e, (String) this.f1549f, this.f1547b));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        kz0 kz0Var = (kz0) this.f1548c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f1549f;
        if (this.f1547b != kz0Var.K) {
            return;
        }
        kz0Var.I = 1;
        kz0Var.J = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                if (!hashSet.contains(keywordResult.emoji)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            kz0Var.f28119x = false;
            kz0Var.v = false;
            kz0Var.c();
            ah.x xVar = kz0Var.d;
            if (xVar != null) {
                xVar.setVisibility(0);
            }
            kz0Var.W = AndroidUtilities.dp(10.0f);
            kz0Var.f28118w = arrayList;
            kz0Var.f28106a0 = 0;
            kz0Var.f28108b0 = Integer.valueOf(str2.length());
            ah.x xVar2 = kz0Var.d;
            if (xVar2 != null) {
                xVar2.invalidate();
            }
            hz0 hz0Var = kz0Var.f28113f;
            if (hz0Var != null) {
                hz0Var.l();
                return;
            }
            return;
        }
        kz0Var.f28118w = null;
        kz0Var.f28119x = true;
        kz0Var.f();
    }

    public j6(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1546a = i11;
        this.f1548c = obj;
        this.f1547b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f1549f = obj4;
    }

    public j6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1546a = i11;
        this.f1548c = notificationCenterDelegate;
        this.d = obj;
        this.f1547b = i10;
        this.e = obj2;
        this.f1549f = obj3;
    }

    public j6(ms0 ms0Var, int i10, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f1546a = 6;
        this.f1548c = ms0Var;
        this.f1547b = i10;
        this.f1549f = o2Var;
        this.d = context;
        this.e = g6Var;
    }

    public j6(qf0 qf0Var, String str, String str2, String str3, int i10) {
        this.f1546a = 3;
        this.f1548c = qf0Var;
        this.d = str;
        this.e = str2;
        this.f1549f = str3;
        this.f1547b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ms0 ms0Var = (ms0) this.f1548c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f1549f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        v9 v9Var = ms0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ms0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= v9Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) v9Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) v9Var.d().get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.f1547b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ms0Var.f50925c));
            boolean h = v9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            h80 H = h80.H(o2Var, view);
            H.W(new ps0(ms0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.q1(ms0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(ms0Var, i12, publicUsername, tL_starGiftCollection2, context, g6Var, o2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.k0(20, ms0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.q1(ms0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new b41(ms0Var, i11, tL_starGiftCollection2, 26));
            ms0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
