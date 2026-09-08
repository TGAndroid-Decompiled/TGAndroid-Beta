package hg;

import android.content.Context;
import android.view.View;
import bi.k9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.i4;
import org.telegram.ui.r80;
import org.telegram.ui.uy;
import org.telegram.ui.v60;
import org.telegram.ui.yq;
public final class e1 implements Runnable {
    public final int f11053a;
    public final int f11054b;
    public final Object f11055c;
    public final Object d;
    public final Object f11056e;
    public final Object f11057f;
    public final Object h;
    public final Object f11058n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f11053a = 1;
        this.f11054b = i10;
        this.f11055c = arrayList;
        this.d = arrayList2;
        this.f11056e = num;
        this.f11057f = albumEntry;
        this.h = albumEntry2;
        this.f11058n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f11053a = i11;
        this.d = obj;
        this.f11054b = i10;
        this.f11055c = serializable;
        this.f11056e = obj2;
        this.f11057f = obj3;
        this.h = obj4;
        this.f11058n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f11053a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f11055c = inputFile;
        this.f11056e = inputMedia;
        this.f11057f = delayedMessage;
        this.f11054b = i10;
        this.f11058n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, f6 f6Var, v60 v60Var) {
        this.f11053a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f11055c = context;
        this.f11054b = i10;
        this.f11056e = exportgroupcallinvite;
        this.f11057f = f6Var;
        this.f11058n = v60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, yq yqVar) {
        this.f11053a = 6;
        this.f11057f = tL_error;
        this.h = tLObject;
        this.f11055c = arrayList;
        this.f11054b = i10;
        this.d = atomicInteger;
        this.f11056e = arrayList2;
        this.f11058n = yqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, of.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f11053a = 8;
        this.d = b2Var;
        this.f11055c = eVar;
        this.h = tLObject;
        this.f11054b = i10;
        this.f11056e = context;
        this.f11058n = tL_inputGroupCallSlug;
        this.f11057f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f11053a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f11054b = i10;
        this.f11055c = document;
        this.f11057f = tL_error;
        this.f11056e = obj;
        this.f11058n = tL_stickers_addStickerToSet;
    }

    public e1(i4 i4Var, int i10, of.e eVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f11053a = 3;
        this.d = i4Var;
        this.f11054b = i10;
        this.f11055c = eVar;
        this.h = tLObject;
        this.f11056e = str;
        this.f11057f = f0Var;
        this.f11058n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, uy uyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f11053a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11054b = i10;
        this.f11055c = uyVar;
        this.f11056e = n2Var;
        this.f11057f = user;
        this.f11058n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, r80 r80Var, String str) {
        this.f11053a = 9;
        this.d = launchActivity;
        this.f11057f = tL_error;
        this.h = tLObject;
        this.f11054b = i10;
        this.f11055c = b2Var;
        this.f11056e = r80Var;
        this.f11058n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, r80 r80Var, int i10, String str) {
        this.f11053a = 10;
        this.d = launchActivity;
        this.f11057f = tL_error;
        this.h = tLObject;
        this.f11055c = tL_inputInvoiceSlug;
        this.f11056e = r80Var;
        this.f11054b = i10;
        this.f11058n = str;
    }

    public e1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f11053a = 12;
        this.d = fg0Var;
        this.f11055c = str;
        this.f11056e = hVar;
        this.f11057f = list;
        this.h = str2;
        this.f11058n = str3;
        this.f11054b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f11053a = 13;
        this.d = profileActivity;
        this.f11055c = view;
        this.f11056e = str;
        this.f11054b = i10;
        this.f11057f = zArr;
        this.h = strArr;
        this.f11058n = str2;
    }

    public e1(org.telegram.ui.web.d1 d1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, k9 k9Var) {
        this.f11053a = 14;
        this.d = d1Var;
        this.f11055c = str;
        this.h = tLObject;
        this.f11057f = tL_error;
        this.f11054b = i10;
        this.f11056e = z0Var;
        this.f11058n = k9Var;
    }
}
