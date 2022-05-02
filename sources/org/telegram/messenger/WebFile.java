package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$InputGeoPoint;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputWebFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputGeoPoint;
import org.telegram.tgnet.TLRPC$TL_inputWebFileGeoPointLocation;
import org.telegram.tgnet.TLRPC$TL_inputWebFileLocation;
import org.telegram.tgnet.TLRPC$TL_webDocument;
import org.telegram.tgnet.TLRPC$WebDocument;

public class WebFile extends TLObject {
    public ArrayList<TLRPC$DocumentAttribute> attributes;
    public TLRPC$InputGeoPoint geo_point;
    public int f825h;
    public TLRPC$InputWebFileLocation location;
    public String mime_type;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public int scale;
    public int size;
    public String url;
    public int f826w;
    public int zoom;

    public static WebFile createWithGeoPoint(TLRPC$GeoPoint tLRPC$GeoPoint, int i, int i2, int i3, int i4) {
        return createWithGeoPoint(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long, tLRPC$GeoPoint.access_hash, i, i2, i3, i4);
    }

    public static WebFile createWithGeoPoint(double d, double d2, long j, int i, int i2, int i3, int i4) {
        WebFile webFile = new WebFile();
        TLRPC$TL_inputWebFileGeoPointLocation tLRPC$TL_inputWebFileGeoPointLocation = new TLRPC$TL_inputWebFileGeoPointLocation();
        webFile.location = tLRPC$TL_inputWebFileGeoPointLocation;
        TLRPC$TL_inputGeoPoint tLRPC$TL_inputGeoPoint = new TLRPC$TL_inputGeoPoint();
        webFile.geo_point = tLRPC$TL_inputGeoPoint;
        tLRPC$TL_inputWebFileGeoPointLocation.geo_point = tLRPC$TL_inputGeoPoint;
        tLRPC$TL_inputWebFileGeoPointLocation.access_hash = j;
        tLRPC$TL_inputGeoPoint.lat = d;
        tLRPC$TL_inputGeoPoint._long = d2;
        webFile.f826w = i;
        tLRPC$TL_inputWebFileGeoPointLocation.f915w = i;
        webFile.f825h = i2;
        tLRPC$TL_inputWebFileGeoPointLocation.f914h = i2;
        webFile.zoom = i3;
        tLRPC$TL_inputWebFileGeoPointLocation.zoom = i3;
        webFile.scale = i4;
        tLRPC$TL_inputWebFileGeoPointLocation.scale = i4;
        webFile.mime_type = "image/png";
        webFile.url = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        webFile.attributes = new ArrayList<>();
        return webFile;
    }

    public static WebFile createWithWebDocument(TLRPC$WebDocument tLRPC$WebDocument) {
        if (!(tLRPC$WebDocument instanceof TLRPC$TL_webDocument)) {
            return null;
        }
        WebFile webFile = new WebFile();
        TLRPC$TL_webDocument tLRPC$TL_webDocument = (TLRPC$TL_webDocument) tLRPC$WebDocument;
        TLRPC$TL_inputWebFileLocation tLRPC$TL_inputWebFileLocation = new TLRPC$TL_inputWebFileLocation();
        webFile.location = tLRPC$TL_inputWebFileLocation;
        String str = tLRPC$WebDocument.url;
        webFile.url = str;
        tLRPC$TL_inputWebFileLocation.url = str;
        tLRPC$TL_inputWebFileLocation.access_hash = tLRPC$TL_webDocument.access_hash;
        webFile.size = tLRPC$TL_webDocument.size;
        webFile.mime_type = tLRPC$TL_webDocument.mime_type;
        webFile.attributes = tLRPC$TL_webDocument.attributes;
        return webFile;
    }
}
