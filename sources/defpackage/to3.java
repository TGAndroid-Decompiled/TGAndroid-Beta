package defpackage;

import org.telegram.tgnet.TLRPC;
public final class to3 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings a;
    public final TLRPC.Document b;
    public final akb c;
    public final zjb d;

    public to3(TLRPC.ThemeSettings themeSettings) {
        this.a = themeSettings;
        akb O0 = bkb.O0(bkb.q0(themeSettings));
        this.c = O0;
        O0.getClass();
        zjb zjbVar = new zjb();
        akb.g(zjbVar, themeSettings);
        zjbVar.b = O0;
        this.d = zjbVar;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper instanceof TLRPC.TL_wallPaper) {
            TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
            this.b = document;
            this.id = document.id;
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
        this.id = -2147483648L;
        this.dc_id = Integer.MIN_VALUE;
    }
}
