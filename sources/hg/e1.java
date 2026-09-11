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
    public final int f11027a;
    public final int f11028b;
    public final Object f11029c;
    public final Object d;
    public final Object f11030e;
    public final Object f11031f;
    public final Object h;
    public final Object f11032n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f11027a = 1;
        this.f11028b = i10;
        this.f11029c = arrayList;
        this.d = arrayList2;
        this.f11030e = num;
        this.f11031f = albumEntry;
        this.h = albumEntry2;
        this.f11032n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f11027a = i11;
        this.d = obj;
        this.f11028b = i10;
        this.f11029c = serializable;
        this.f11030e = obj2;
        this.f11031f = obj3;
        this.h = obj4;
        this.f11032n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f11027a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f11029c = inputFile;
        this.f11030e = inputMedia;
        this.f11031f = delayedMessage;
        this.f11028b = i10;
        this.f11032n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, f6 f6Var, v60 v60Var) {
        this.f11027a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f11029c = context;
        this.f11028b = i10;
        this.f11030e = exportgroupcallinvite;
        this.f11031f = f6Var;
        this.f11032n = v60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, yq yqVar) {
        this.f11027a = 6;
        this.f11031f = tL_error;
        this.h = tLObject;
        this.f11029c = arrayList;
        this.f11028b = i10;
        this.d = atomicInteger;
        this.f11030e = arrayList2;
        this.f11032n = yqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, of.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f11027a = 8;
        this.d = b2Var;
        this.f11029c = eVar;
        this.h = tLObject;
        this.f11028b = i10;
        this.f11030e = context;
        this.f11032n = tL_inputGroupCallSlug;
        this.f11031f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f11027a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f11028b = i10;
        this.f11029c = document;
        this.f11031f = tL_error;
        this.f11030e = obj;
        this.f11032n = tL_stickers_addStickerToSet;
    }

    public e1(i4 i4Var, int i10, of.e eVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f11027a = 3;
        this.d = i4Var;
        this.f11028b = i10;
        this.f11029c = eVar;
        this.h = tLObject;
        this.f11030e = str;
        this.f11031f = f0Var;
        this.f11032n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, uy uyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f11027a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11028b = i10;
        this.f11029c = uyVar;
        this.f11030e = n2Var;
        this.f11031f = user;
        this.f11032n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, r80 r80Var, String str) {
        this.f11027a = 9;
        this.d = launchActivity;
        this.f11031f = tL_error;
        this.h = tLObject;
        this.f11028b = i10;
        this.f11029c = b2Var;
        this.f11030e = r80Var;
        this.f11032n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, r80 r80Var, int i10, String str) {
        this.f11027a = 10;
        this.d = launchActivity;
        this.f11031f = tL_error;
        this.h = tLObject;
        this.f11029c = tL_inputInvoiceSlug;
        this.f11030e = r80Var;
        this.f11028b = i10;
        this.f11032n = str;
    }

    public e1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f11027a = 12;
        this.d = fg0Var;
        this.f11029c = str;
        this.f11030e = hVar;
        this.f11031f = list;
        this.h = str2;
        this.f11032n = str3;
        this.f11028b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f11027a = 13;
        this.d = profileActivity;
        this.f11029c = view;
        this.f11030e = str;
        this.f11028b = i10;
        this.f11031f = zArr;
        this.h = strArr;
        this.f11032n = str2;
    }

    public e1(org.telegram.ui.web.d1 d1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, k9 k9Var) {
        this.f11027a = 14;
        this.d = d1Var;
        this.f11029c = str;
        this.h = tLObject;
        this.f11031f = tL_error;
        this.f11028b = i10;
        this.f11030e = z0Var;
        this.f11032n = k9Var;
    }
}
