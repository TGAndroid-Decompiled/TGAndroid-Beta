package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f9 {
    public int f1031a;
    public String f1032b;
    public TLRPC.Photo f1033c;
    public TLRPC.Document d;

    public static f9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f1031a = tL_storyAlbum.album_id;
        obj.f1032b = tL_storyAlbum.title;
        obj.f1033c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
