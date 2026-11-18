package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class t5 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings f26962a;
    public final TLRPC.Document f26963b;
    public final org.telegram.ui.ActionBar.m6 f26964c;
    public final org.telegram.ui.ActionBar.k6 d;

    public t5(TLRPC.ThemeSettings themeSettings) {
        this.f26962a = themeSettings;
        org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0(org.telegram.ui.ActionBar.n6.r0(themeSettings));
        this.f26964c = Q0;
        Q0.getClass();
        org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6();
        org.telegram.ui.ActionBar.m6.i(k6Var, themeSettings);
        k6Var.f29171b = Q0;
        this.d = k6Var;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper instanceof TLRPC.TL_wallPaper) {
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.f26963b = document;
            this.f28411id = document.f28411id;
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
        this.f28411id = -2147483648L;
        this.dc_id = Integer.MIN_VALUE;
    }
}
