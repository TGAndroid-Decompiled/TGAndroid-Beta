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
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.ls0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.nf0;
import org.telegram.ui.vm0;
import org.telegram.ui.xm0;
import org.telegram.ui.yq0;
public final class i6 implements org.telegram.ui.ActionBar.a2, md0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final int f1483a;
    public final int f1484b;
    public final Object f1485c;
    public final Object d;
    public final Object e;
    public final Object f1486f;

    public i6(int i10, od0 od0Var, org.telegram.ui.Components.e4 e4Var, org.telegram.ui.Components.f4 f4Var, TextView textView) {
        this.f1483a = 1;
        this.f1484b = i10;
        this.f1485c = od0Var;
        this.d = e4Var;
        this.e = f4Var;
        this.f1486f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ag.a aVar;
        switch (this.f1483a) {
            case 0:
                k6 k6Var = (k6) this.f1485c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f1486f;
                h6 h6Var = (h6) k6Var.f1653o.get(k6Var.f1655q);
                if (h6Var != null) {
                    ag.a aVar2 = h6Var.f1412c;
                    ga x10 = ga.x(this.f1484b, k6Var.f1655q);
                    if (x10.e) {
                        aVar = ag.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f632b > aVar.f632b) {
                        ag.c cVar = k6Var.f1655q;
                        if (cVar == ag.c.f635a) {
                            new cd(context, d6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (cVar == ag.c.f636b) {
                            new fi.f(context, d6Var, h6Var.f1412c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    pf.c cVar2 = k6Var.f1652n;
                    if (cVar2 != null) {
                        cVar2.a(false);
                        k6Var.f1652n = null;
                    }
                    callback2.run(h6Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.d;
                vm0 vm0Var = (vm0) this.e;
                xm0.Z(this.f1484b, (String) this.f1486f, secureDocument, vm0Var, (xm0) this.f1485c);
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.m2 m2Var = (rg.m2) this.f1485c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f1484b;
        yq0 yq0Var = (yq0) this.e;
        gi.g4 g4Var = (gi.g4) this.f1486f;
        m2Var.f45529x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && m2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new az0(m2Var, bitmap, i10, yq0Var, 20), 2000L);
        } else {
            g4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((nf0) this.f1485c, (String) this.d, iVar, list, (String) this.e, (String) this.f1486f, this.f1484b));
    }

    @Override
    public void q(od0 od0Var, int i10) {
        od0 od0Var2 = (od0) this.f1485c;
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.d;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.e;
        org.telegram.ui.Components.f5.f(null, null, 0L, this.f1484b, 3, od0Var2, e4Var, f4Var);
        org.telegram.ui.Components.f5.d((TextView) this.f1486f, od0Var2, e4Var, f4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        gz0 gz0Var = (gz0) this.f1485c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f1486f;
        if (this.f1484b != gz0Var.I) {
            return;
        }
        gz0Var.G = 1;
        gz0Var.H = str2;
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
            gz0Var.f26715x = false;
            gz0Var.v = false;
            gz0Var.c();
            ah.x xVar = gz0Var.d;
            if (xVar != null) {
                xVar.setVisibility(0);
            }
            gz0Var.U = AndroidUtilities.dp(10.0f);
            gz0Var.f26714w = arrayList;
            gz0Var.V = 0;
            gz0Var.W = Integer.valueOf(str2.length());
            ah.x xVar2 = gz0Var.d;
            if (xVar2 != null) {
                xVar2.invalidate();
            }
            dz0 dz0Var = gz0Var.f26710f;
            if (dz0Var != null) {
                dz0Var.l();
                return;
            }
            return;
        }
        gz0Var.f26714w = null;
        gz0Var.f26715x = true;
        gz0Var.f();
    }

    public i6(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1483a = i11;
        this.f1485c = obj;
        this.f1484b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f1486f = obj4;
    }

    public i6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1483a = i11;
        this.f1485c = notificationCenterDelegate;
        this.d = obj;
        this.f1484b = i10;
        this.e = obj2;
        this.f1486f = obj3;
    }

    public i6(is0 is0Var, int i10, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1483a = 6;
        this.f1485c = is0Var;
        this.f1484b = i10;
        this.f1486f = n2Var;
        this.d = context;
        this.e = d6Var;
    }

    public i6(nf0 nf0Var, String str, String str2, String str3, int i10) {
        this.f1483a = 3;
        this.f1485c = nf0Var;
        this.d = str;
        this.e = str2;
        this.f1486f = str3;
        this.f1484b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        is0 is0Var = (is0) this.f1485c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f1486f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        v9 v9Var = is0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !is0Var.L) {
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
            int i12 = this.f1484b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(is0Var.f50459c));
            boolean h = v9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            i80 H = i80.H(n2Var, view);
            H.W(new ls0(is0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.q1(is0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(is0Var, i12, publicUsername, tL_starGiftCollection2, context, d6Var, n2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.q0(19, is0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.q1(is0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new w31(is0Var, i11, tL_starGiftCollection2, 26));
            is0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
