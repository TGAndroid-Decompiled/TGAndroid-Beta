package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s5 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings f26409a;
    public final TLRPC.Document f26410b;
    public final org.telegram.ui.ActionBar.i6 f26411c;
    public final org.telegram.ui.ActionBar.g6 d;

    public s5(TLRPC.ThemeSettings themeSettings) {
        this.f26409a = themeSettings;
        org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0(org.telegram.ui.ActionBar.j6.r0(themeSettings));
        this.f26411c = Q0;
        Q0.getClass();
        org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6();
        org.telegram.ui.ActionBar.i6.i(g6Var, themeSettings);
        g6Var.f28603b = Q0;
        this.d = g6Var;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper instanceof TLRPC.TL_wallPaper) {
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.f26410b = document;
            this.f28057id = document.f28057id;
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
        this.f28057id = -2147483648L;
        this.dc_id = Integer.MIN_VALUE;
    }
}
