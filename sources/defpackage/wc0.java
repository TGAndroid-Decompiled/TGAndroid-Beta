package defpackage;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class wc0 {
    public final gn5 a;
    public final gn5 b;
    public final gn5 c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final cd0[] i;
    public final yc0 j;

    public wc0(gn5 gn5Var, gn5 gn5Var2, gn5 gn5Var3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, cd0[] cd0VarArr, yc0 yc0Var) {
        this.a = gn5Var;
        this.b = gn5Var2;
        this.c = gn5Var3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = cd0VarArr;
        this.j = yc0Var;
    }

    public static wc0 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, cd0... cd0VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        gn5 gn5Var;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        gn5 m = gn5.m(z8c.t0, 0, chat);
        gn5 m2 = gn5.m(z8c.t0, 1, chat);
        String str3 = null;
        if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (chat != null && (chatPhoto = chat.photo) != null) {
            bitmapDrawable = chatPhoto.strippedBitmap;
        } else {
            bitmapDrawable = null;
        }
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo != null && !photo.video_sizes.isEmpty()) {
            TLRPC.VideoSize x = bc4.x(1000, chatFull.chat_photo.video_sizes);
            gn5Var = gn5.j(x, chatFull.chat_photo);
            str2 = bc4.r(null, x);
        } else {
            gn5Var = null;
            str2 = null;
        }
        if (gn5Var != null && gn5Var.p == 2) {
            str3 = "g";
        }
        return new wc0(m, m2, gn5Var, str, str3, str2, bitmapDrawable, chat, cd0VarArr, null);
    }

    public static wc0 b(TLRPC.User user, int i, cd0... cd0VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        gn5 m = gn5.m(z8c.t0, 0, user);
        gn5 m2 = gn5.m(z8c.t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new wc0(m, m2, null, str, null, null, bitmapDrawable, user, cd0VarArr, new yc0(i, nm7.E0, user));
    }

    public static wc0 c(TLRPC.User user, TLRPC.UserFull userFull, cd0... cd0VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        gn5 gn5Var;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        gn5 m = gn5.m(z8c.t0, 0, userFull.user);
        String str3 = null;
        if (m == null && (photo = userFull.profile_photo) != null) {
            m = gn5.i(bc4.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        gn5 gn5Var2 = m;
        gn5 m2 = gn5.m(z8c.t0, 1, userFull.user);
        if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        } else {
            bitmapDrawable = null;
        }
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 != null && !photo2.video_sizes.isEmpty()) {
            TLRPC.VideoSize x = bc4.x(1000, userFull.profile_photo.video_sizes);
            gn5 j = gn5.j(x, userFull.profile_photo);
            str2 = bc4.r(null, x);
            gn5Var = j;
        } else {
            gn5Var = null;
            str2 = null;
        }
        if (gn5Var != null && gn5Var.p == 2) {
            str3 = "g";
        }
        return new wc0(gn5Var2, m2, gn5Var, str, str3, str2, bitmapDrawable, userFull.user, cd0VarArr, null);
    }
}
