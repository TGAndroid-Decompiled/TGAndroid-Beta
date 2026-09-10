package fg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.h90;
import org.telegram.ui.j4;
import org.telegram.ui.u60;
import org.telegram.ui.wy;
import org.telegram.ui.zq;
public final class f1 implements Runnable {
    public final int f8012a;
    public final int f8013b;
    public final Object f8014c;
    public final Object d;
    public final Object e;
    public final Object f8015f;
    public final Object h;
    public final Object f8016n;

    public f1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f8012a = 1;
        this.f8013b = i10;
        this.f8014c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f8015f = albumEntry;
        this.h = albumEntry2;
        this.f8016n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fg.f1.run():void");
    }

    public f1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f8012a = i11;
        this.d = obj;
        this.f8013b = i10;
        this.f8014c = serializable;
        this.e = obj2;
        this.f8015f = obj3;
        this.h = obj4;
        this.f8016n = obj5;
    }

    public f1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f8012a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f8014c = inputFile;
        this.e = inputMedia;
        this.f8015f = delayedMessage;
        this.f8013b = i10;
        this.f8016n = str;
    }

    public f1(TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, f6 f6Var, u60 u60Var) {
        this.f8012a = 5;
        this.h = tLObject;
        this.d = d2Var;
        this.f8014c = context;
        this.f8013b = i10;
        this.e = exportgroupcallinvite;
        this.f8015f = f6Var;
        this.f8016n = u60Var;
    }

    public f1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, zq zqVar) {
        this.f8012a = 6;
        this.f8015f = tL_error;
        this.h = tLObject;
        this.f8014c = arrayList;
        this.f8013b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f8016n = zqVar;
    }

    public f1(org.telegram.ui.ActionBar.d2 d2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f8012a = 8;
        this.d = d2Var;
        this.f8014c = eVar;
        this.h = tLObject;
        this.f8013b = i10;
        this.e = context;
        this.f8016n = tL_inputGroupCallSlug;
        this.f8015f = tL_error;
    }

    public f1(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f8012a = 7;
        this.d = d2Var;
        this.h = tLObject;
        this.f8013b = i10;
        this.f8014c = document;
        this.f8015f = tL_error;
        this.e = obj;
        this.f8016n = tL_stickers_addStickerToSet;
    }

    public f1(j4 j4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f8012a = 3;
        this.d = j4Var;
        this.f8013b = i10;
        this.f8014c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f8015f = g0Var;
        this.f8016n = tL_messages_getWebPage;
    }

    public f1(LaunchActivity launchActivity, TLObject tLObject, int i10, wy wyVar, p2 p2Var, TLRPC.User user, String str) {
        this.f8012a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f8013b = i10;
        this.f8014c = wyVar;
        this.e = p2Var;
        this.f8015f = user;
        this.f8016n = str;
    }

    public f1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, h90 h90Var, String str) {
        this.f8012a = 9;
        this.d = launchActivity;
        this.f8015f = tL_error;
        this.h = tLObject;
        this.f8013b = i10;
        this.f8014c = d2Var;
        this.e = h90Var;
        this.f8016n = str;
    }

    public f1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, h90 h90Var, int i10, String str) {
        this.f8012a = 10;
        this.d = launchActivity;
        this.f8015f = tL_error;
        this.h = tLObject;
        this.f8014c = tL_inputInvoiceSlug;
        this.e = h90Var;
        this.f8013b = i10;
        this.f8016n = str;
    }

    public f1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f8012a = 12;
        this.d = fg0Var;
        this.f8014c = str;
        this.e = hVar;
        this.f8015f = list;
        this.h = str2;
        this.f8016n = str3;
        this.f8013b = i10;
    }

    public f1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f8012a = 13;
        this.d = profileActivity;
        this.f8014c = view;
        this.e = str;
        this.f8013b = i10;
        this.f8015f = zArr;
        this.h = strArr;
        this.f8016n = str2;
    }

    public f1(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, org.telegram.ui.web.a1 a1Var) {
        this.f8012a = 14;
        this.d = c1Var;
        this.f8014c = str;
        this.h = tLObject;
        this.f8015f = tL_error;
        this.f8013b = i10;
        this.e = y0Var;
        this.f8016n = a1Var;
    }
}
