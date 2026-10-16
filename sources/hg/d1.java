package hg;

import android.content.Context;
import android.view.View;
import bi.n9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br;
import org.telegram.ui.d20;
import org.telegram.ui.jg0;
import org.telegram.ui.k4;
import org.telegram.ui.yy;
import org.telegram.ui.z60;
public final class d1 implements Runnable {
    public final int f10528a;
    public final int f10529b;
    public final Object f10530c;
    public final Object d;
    public final Object e;
    public final Object f10531f;
    public final Object h;
    public final Object f10532n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10528a = 1;
        this.f10529b = i10;
        this.f10530c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f10531f = albumEntry;
        this.h = albumEntry2;
        this.f10532n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10528a = i11;
        this.d = obj;
        this.f10529b = i10;
        this.f10530c = serializable;
        this.e = obj2;
        this.f10531f = obj3;
        this.h = obj4;
        this.f10532n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f10528a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f10530c = inputFile;
        this.e = inputMedia;
        this.f10531f = delayedMessage;
        this.f10529b = i10;
        this.f10532n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, c6 c6Var, z60 z60Var) {
        this.f10528a = 5;
        this.h = tLObject;
        this.d = a2Var;
        this.f10530c = context;
        this.f10529b = i10;
        this.e = exportgroupcallinvite;
        this.f10531f = c6Var;
        this.f10532n = z60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, br brVar) {
        this.f10528a = 6;
        this.f10531f = tL_error;
        this.h = tLObject;
        this.f10530c = arrayList;
        this.f10529b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f10532n = brVar;
    }

    public d1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10528a = 7;
        this.d = a2Var;
        this.h = tLObject;
        this.f10529b = i10;
        this.f10530c = document;
        this.f10531f = tL_error;
        this.e = obj;
        this.f10532n = tL_stickers_addStickerToSet;
    }

    public d1(org.telegram.ui.ActionBar.a2 a2Var, pf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f10528a = 8;
        this.d = a2Var;
        this.f10530c = cVar;
        this.h = tLObject;
        this.f10529b = i10;
        this.e = context;
        this.f10532n = tL_inputGroupCallSlug;
        this.f10531f = tL_error;
    }

    public d1(k4 k4Var, int i10, pf.c cVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10528a = 3;
        this.d = k4Var;
        this.f10529b = i10;
        this.f10530c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f10531f = g0Var;
        this.f10532n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, yy yyVar, m2 m2Var, TLRPC.User user, String str) {
        this.f10528a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f10529b = i10;
        this.f10530c = yyVar;
        this.e = m2Var;
        this.f10531f = user;
        this.f10532n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, d20 d20Var, String str) {
        this.f10528a = 9;
        this.d = launchActivity;
        this.f10531f = tL_error;
        this.h = tLObject;
        this.f10529b = i10;
        this.f10530c = a2Var;
        this.e = d20Var;
        this.f10532n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, d20 d20Var, int i10, String str) {
        this.f10528a = 10;
        this.d = launchActivity;
        this.f10531f = tL_error;
        this.h = tLObject;
        this.f10530c = tL_inputInvoiceSlug;
        this.e = d20Var;
        this.f10529b = i10;
        this.f10532n = str;
    }

    public d1(jg0 jg0Var, String str, c5.i iVar, List list, String str2, String str3, int i10) {
        this.f10528a = 12;
        this.d = jg0Var;
        this.f10530c = str;
        this.e = iVar;
        this.f10531f = list;
        this.h = str2;
        this.f10532n = str3;
        this.f10529b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10528a = 13;
        this.d = profileActivity;
        this.f10530c = view;
        this.e = str;
        this.f10529b = i10;
        this.f10531f = zArr;
        this.h = strArr;
        this.f10532n = str2;
    }

    public d1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.h0 h0Var, Utilities.Callback callback) {
        this.f10528a = 14;
        this.d = e2Var;
        this.f10530c = a2Var;
        this.f10529b = i10;
        this.e = obj;
        this.f10531f = str;
        this.h = h0Var;
        this.f10532n = callback;
    }

    public d1(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, n9 n9Var) {
        this.f10528a = 15;
        this.d = c1Var;
        this.f10530c = str;
        this.h = tLObject;
        this.f10531f = tL_error;
        this.f10529b = i10;
        this.e = z0Var;
        this.f10532n = n9Var;
    }
}
