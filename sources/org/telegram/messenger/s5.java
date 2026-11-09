package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s5 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings f25415a;
    public final TLRPC.Document f25416b;
    public final org.telegram.ui.ActionBar.k6 f25417c;
    public final org.telegram.ui.ActionBar.i6 d;

    public s5(TLRPC.ThemeSettings themeSettings) {
        this.f25415a = themeSettings;
        org.telegram.ui.ActionBar.k6 Q0 = org.telegram.ui.ActionBar.l6.Q0(org.telegram.ui.ActionBar.l6.r0(themeSettings));
        this.f25417c = Q0;
        Q0.getClass();
        org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6();
        org.telegram.ui.ActionBar.k6.i(i6Var, themeSettings);
        i6Var.f27572b = Q0;
        this.d = i6Var;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper instanceof TLRPC.TL_wallPaper) {
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.f25416b = document;
            this.f26962id = document.f26962id;
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
        this.f26962id = -2147483648L;
        this.dc_id = Integer.MIN_VALUE;
    }
}
