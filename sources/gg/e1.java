package gg;

import ai.da;
import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.h4;
import org.telegram.ui.ma0;
import org.telegram.ui.u60;
import org.telegram.ui.uy;
import org.telegram.ui.xq;
public final class e1 implements Runnable {
    public final int f9719a;
    public final int f9720b;
    public final Object f9721c;
    public final Object d;
    public final Object e;
    public final Object f9722f;
    public final Object h;
    public final Object f9723n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f9719a = 1;
        this.f9720b = i10;
        this.f9721c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f9722f = albumEntry;
        this.h = albumEntry2;
        this.f9723n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9719a = i11;
        this.d = obj;
        this.f9720b = i10;
        this.f9721c = serializable;
        this.e = obj2;
        this.f9722f = obj3;
        this.h = obj4;
        this.f9723n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f9719a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f9721c = inputFile;
        this.e = inputMedia;
        this.f9722f = delayedMessage;
        this.f9720b = i10;
        this.f9723n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, e6 e6Var, u60 u60Var) {
        this.f9719a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f9721c = context;
        this.f9720b = i10;
        this.e = exportgroupcallinvite;
        this.f9722f = e6Var;
        this.f9723n = u60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, xq xqVar) {
        this.f9719a = 6;
        this.f9722f = tL_error;
        this.h = tLObject;
        this.f9721c = arrayList;
        this.f9720b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f9723n = xqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f9719a = 8;
        this.d = b2Var;
        this.f9721c = eVar;
        this.h = tLObject;
        this.f9720b = i10;
        this.e = context;
        this.f9723n = tL_inputGroupCallSlug;
        this.f9722f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f9719a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f9720b = i10;
        this.f9721c = document;
        this.f9722f = tL_error;
        this.e = obj;
        this.f9723n = tL_stickers_addStickerToSet;
    }

    public e1(h4 h4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f9719a = 3;
        this.d = h4Var;
        this.f9720b = i10;
        this.f9721c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f9722f = f0Var;
        this.f9723n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, uy uyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f9719a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f9720b = i10;
        this.f9721c = uyVar;
        this.e = n2Var;
        this.f9722f = user;
        this.f9723n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, ma0 ma0Var, String str) {
        this.f9719a = 9;
        this.d = launchActivity;
        this.f9722f = tL_error;
        this.h = tLObject;
        this.f9720b = i10;
        this.f9721c = b2Var;
        this.e = ma0Var;
        this.f9723n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, ma0 ma0Var, int i10, String str) {
        this.f9719a = 10;
        this.d = launchActivity;
        this.f9722f = tL_error;
        this.h = tLObject;
        this.f9721c = tL_inputInvoiceSlug;
        this.e = ma0Var;
        this.f9720b = i10;
        this.f9723n = str;
    }

    public e1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f9719a = 12;
        this.d = fg0Var;
        this.f9721c = str;
        this.e = hVar;
        this.f9722f = list;
        this.h = str2;
        this.f9723n = str3;
        this.f9720b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f9719a = 13;
        this.d = profileActivity;
        this.f9721c = view;
        this.e = str;
        this.f9720b = i10;
        this.f9722f = zArr;
        this.h = strArr;
        this.f9723n = str2;
    }

    public e1(org.telegram.ui.web.d1 d1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, da daVar) {
        this.f9719a = 14;
        this.d = d1Var;
        this.f9721c = str;
        this.h = tLObject;
        this.f9722f = tL_error;
        this.f9720b = i10;
        this.e = z0Var;
        this.f9723n = daVar;
    }
}
