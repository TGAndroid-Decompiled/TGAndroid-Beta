package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class u5 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings f18384a;
    public final TLRPC.Document f18385b;
    public final org.telegram.ui.ActionBar.s6 f18386c;
    public final org.telegram.ui.ActionBar.r6 d;

    public u5(TLRPC.ThemeSettings themeSettings) {
        this.f18384a = themeSettings;
        org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0(org.telegram.ui.ActionBar.t6.r0(themeSettings));
        this.f18386c = Q0;
        Q0.getClass();
        org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6();
        org.telegram.ui.ActionBar.s6.i(r6Var, themeSettings);
        r6Var.f20732b = Q0;
        this.d = r6Var;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper instanceof TLRPC.TL_wallPaper) {
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.f18385b = document;
            this.f19800id = document.f19800id;
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
        this.f19800id = -2147483648L;
        this.dc_id = Integer.MIN_VALUE;
    }
}
