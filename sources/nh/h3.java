package nh;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import jh.x4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pq;

public final class h3 implements Runnable {

    public final int f18722a = 0;

    public final int f18723b;

    public final TLRPC.TL_error f18724c;
    public final TLObject d;

    public final boolean f18725e;

    public final long f18726f;
    public final long h;

    public final Object f18727n;

    public final Object f18728r;

    public final Object f18729s;
    public final Object v;

    public final Object f18730w;

    public final Object f18731x;

    public h3(lh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.e3 e3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, c6 c6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f18727n = dVar;
        this.d = tLObject;
        this.f18723b = i10;
        this.f18726f = j10;
        this.f18728r = e3Var;
        this.f18729s = starrefprogram;
        this.h = j11;
        this.f18725e = z10;
        this.v = context;
        this.f18730w = c6Var;
        this.f18731x = user;
        this.f18724c = tL_error;
    }

    @Override
    public final void run() {
        TL_payments.connectedBotStarRef connectedbotstarref;
        org.telegram.ui.ActionBar.n2 n2VarU;
        int i10;
        int i11 = this.f18722a;
        Object obj = this.f18731x;
        Object obj2 = this.f18730w;
        long j10 = this.h;
        Object obj3 = this.v;
        Object obj4 = this.f18729s;
        boolean z10 = this.f18725e;
        Object obj5 = this.f18728r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f18724c;
        Object obj6 = this.f18727n;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                c6 c6Var = (c6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((lh.d) obj6).setLoading(false);
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i12 = this.f18723b;
                    hh.c0 c0VarG = hh.c0.g(i12);
                    long j11 = this.f18726f;
                    hh.z zVarD = c0VarG.d(j11);
                    int i13 = zVarD.f10395a;
                    MessagesController.getInstance(i13).putUsers(connectedstarrefbots.users, false);
                    zVarD.f10397c = 0;
                    zVarD.h = false;
                    zVarD.d = false;
                    ArrayList arrayList = zVarD.f10398e;
                    arrayList.clear();
                    if (zVarD.f10401i != 0) {
                        ConnectionsManager.getInstance(i13).cancelRequest(zVarD.f10401i, true);
                        zVarD.f10401i = 0;
                    }
                    zVarD.f10400g = false;
                    zVarD.f10397c = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    zVarD.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= zVarD.f10397c;
                    zVarD.h = false;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(zVarD.f10396b));
                    zVarD.a();
                    e3Var.dismiss();
                    int i14 = 0;
                    while (true) {
                        if (i14 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i14);
                            if (connectedbotstarref.bot_id != starrefprogram.bot_id) {
                                i14++;
                            }
                        } else {
                            connectedbotstarref = null;
                        }
                    }
                    if ((j10 != j11 || z10) && (n2VarU = LaunchActivity.U()) != null && (!(n2VarU instanceof s3) || ((s3) n2VarU).L != j11)) {
                        n2VarU.presentFragment(new s3(j11));
                    }
                    if (connectedbotstarref != null) {
                        hh.a0 a0VarE = hh.c0.g(i12).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList2 = a0VarE.f8937e;
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_payments.starRefProgram) arrayList2.get(i15)).bot_id == j12) {
                                arrayList2.remove(i15);
                                a0VarE.f8936c--;
                                NotificationCenter.getInstance(a0VarE.f8934a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(a0VarE.f8935b));
                                new mc(s3.H0(context, i12, connectedbotstarref, j11, c6Var).topBulletinContainer, c6Var).V(Arrays.asList(user), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).j();
                            }
                            break;
                        }
                        new mc(s3.H0(context, i12, connectedbotstarref, j11, c6Var).topBulletinContainer, c6Var).V(Arrays.asList(user), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).j();
                    }
                } else if (tL_error != null) {
                    pa.t(e3Var.topBulletinContainer, c6Var, tL_error, false);
                }
                break;
            default:
                ak akVar = (ak) obj6;
                AccountInstance accountInstance = (AccountInstance) obj5;
                String str = (String) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = akVar.L;
                SparseArray sparseArray = akVar.K;
                ArrayList arrayList7 = akVar.I;
                HashMap map = akVar.M;
                ArrayList arrayList8 = akVar.J;
                ArrayList arrayList9 = akVar.H;
                bk bkVar = akVar.T;
                x4 x4Var = bkVar.H;
                if (this.f18723b == akVar.P) {
                    akVar.O = false;
                    if (tL_error != null) {
                        eh.s sVar = x4Var.d;
                        p80 p80Var = x4Var.f29506e;
                        sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        p80Var.setVisibility(0);
                        p80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        x4Var.e(false, true);
                    } else {
                        qj qjVar = bkVar.f27115r;
                        x4Var.e(false, true);
                        p80 p80Var2 = x4Var.f29506e;
                        eh.s sVar2 = x4Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        akVar.C = messages_messages.next_rate;
                        qj qjVar2 = qjVar;
                        accountInstance.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        accountInstance.getMessagesController().putUsers(messages_messages.users, false);
                        accountInstance.getMessagesController().putChats(messages_messages.chats, false);
                        if (!z10) {
                            arrayList8.clear();
                            sparseArray.clear();
                            arrayList6.clear();
                            map.clear();
                        }
                        int size = messages_messages.count;
                        akVar.G = str;
                        int size2 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            MessageObject messageObject = (MessageObject) arrayList3.get(i16);
                            ArrayList arrayList10 = (ArrayList) map.get(messageObject.monthKey);
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                                map.put(messageObject.monthKey, arrayList10);
                                arrayList6.add(messageObject.monthKey);
                            }
                            arrayList10.add(messageObject);
                            arrayList8.add(messageObject);
                            sparseArray.put(messageObject.getId(), messageObject);
                            i16++;
                            arrayList3 = arrayList3;
                        }
                        if (arrayList8.size() > size) {
                            size = arrayList8.size();
                        }
                        akVar.R = arrayList8.size() >= size;
                        if (arrayList8.isEmpty()) {
                            if (TextUtils.isEmpty(akVar.G) && this.f18726f == 0 && j10 == 0) {
                                sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                p80Var2.setVisibility(0);
                                p80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                p80Var2.setVisibility(0);
                                p80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            }
                        }
                        if (!z10) {
                            arrayList9.clear();
                            if (arrayList4 != null) {
                                arrayList9.addAll(arrayList4);
                            }
                            if (str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList9.size()) {
                                        arrayList9.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                    } else if (!(arrayList9.get(i17) instanceof TLRPC.User) || UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id != ((TLRPC.User) arrayList9.get(i17)).f22527id) {
                                        i17++;
                                    }
                                }
                            }
                            arrayList7.clear();
                            arrayList7.addAll(arrayList5);
                            akVar.a0(arrayList9, arrayList7, TextUtils.isEmpty(akVar.G));
                        }
                        int iR = -1;
                        View view = null;
                        int i18 = 0;
                        while (i18 < size2) {
                            qj qjVar3 = qjVar2;
                            View childAt = qjVar3.getChildAt(i18);
                            if (childAt instanceof h00) {
                                iR = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i18++;
                            qjVar2 = qjVar3;
                        }
                        qj qjVar4 = qjVar2;
                        if (view != null) {
                            qjVar4.removeView(view);
                        }
                        if (bkVar.F.getVisibility() == 0) {
                            i10 = 1;
                            if (qjVar4.getChildCount() <= 1) {
                                bkVar.getViewTreeObserver().addOnPreDrawListener(new pq(akVar, (h00) view, iR, i10));
                            }
                            akVar.l();
                        } else {
                            i10 = 1;
                        }
                        if (view != null) {
                            bkVar.getViewTreeObserver().addOnPreDrawListener(new pq(akVar, (h00) view, iR, i10));
                        }
                        akVar.l();
                    }
                    break;
                }
                break;
        }
    }

    public h3(ak akVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f18727n = akVar;
        this.f18723b = i10;
        this.f18724c = tL_error;
        this.d = tLObject;
        this.f18728r = accountInstance;
        this.f18725e = z10;
        this.f18729s = str;
        this.v = arrayList;
        this.f18726f = j10;
        this.h = j11;
        this.f18730w = arrayList2;
        this.f18731x = arrayList3;
    }
}
