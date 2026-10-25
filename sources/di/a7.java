package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a7 {
    public int f8375a;
    public String f8376b;
    public TLRPC.Photo f8377c;
    public TLRPC.Document d;

    public static a7 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f8375a = tL_storyAlbum.album_id;
        obj.f8376b = tL_storyAlbum.title;
        obj.f8377c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
