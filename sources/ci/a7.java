package ci;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a7 {
    public int f5152a;
    public String f5153b;
    public TLRPC.Photo f5154c;
    public TLRPC.Document d;

    public static a7 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f5152a = tL_storyAlbum.album_id;
        obj.f5153b = tL_storyAlbum.title;
        obj.f5154c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
