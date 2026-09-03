package nh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 {
    public int f15598a;
    public String f15599b;
    public TLRPC.Photo f15600c;
    public TLRPC.Document d;

    public static m6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f15598a = tL_storyAlbum.album_id;
        obj.f15599b = tL_storyAlbum.title;
        obj.f15600c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
