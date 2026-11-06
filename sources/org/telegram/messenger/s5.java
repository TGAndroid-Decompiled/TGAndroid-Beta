package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s5 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings f25419a;
    public final TLRPC.Document f25420b;
    public final org.telegram.ui.ActionBar.j6 f25421c;
    public final org.telegram.ui.ActionBar.h6 d;

    public s5(TLRPC.ThemeSettings themeSettings) {
        this.f25419a = themeSettings;
        org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(themeSettings));
        this.f25421c = Q0;
        Q0.getClass();
        org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6();
        org.telegram.ui.ActionBar.j6.i(h6Var, themeSettings);
        h6Var.f27517b = Q0;
        this.d = h6Var;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper instanceof TLRPC.TL_wallPaper) {
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.f25420b = document;
            this.f26959id = document.f26959id;
            this.access_hash = document.access_hash;
            this.file_reference = document.file_reference;
            this.user_id = document.user_id;
            this.date = document.date;
            this.file_name = document.file_name;
            this.mime_type = document.mime_type;
            this.size = document.size;
            this.thumbs = document.thumbs;
            this.version = document.version;
            this.dc_id = document.dc_id;
            this.key = document.key;
            this.iv = document.iv;
            this.attributes = document.attributes;
            return;
        }
        this.f26959id = -2147483648L;
        this.dc_id = Integer.MIN_VALUE;
    }
}
