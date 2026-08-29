package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class WebFile extends TLObject {
    public ArrayList<TLRPC.DocumentAttribute> attributes;
    public TLRPC.InputGeoPoint geo_point;
    public int h;
    public TLRPC.InputWebFileLocation location;
    public String mime_type;
    public int msg_id;
    public boolean noproxy;
    public TLRPC.InputPeer peer;
    public int scale;
    public int size;
    public String url;
    public int f19646w;
    public int zoom;

    public static WebFile createWithGeoPoint(TLRPC.GeoPoint geoPoint, int i10, int i11, int i12, int i13) {
        return createWithGeoPoint(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i10, i11, i12, i13);
    }

    public static WebFile createWithWebDocument(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            WebFile webFile = new WebFile();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            webFile.location = tL_inputWebFileLocation;
            String str = webDocument.url;
            webFile.url = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            webFile.size = tL_webDocument.size;
            webFile.mime_type = tL_webDocument.mime_type;
            webFile.attributes = tL_webDocument.attributes;
            return webFile;
        } else if (webDocument instanceof TLRPC.TL_webDocumentNoProxy) {
            WebFile webFile2 = new WebFile();
            TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
            webFile2.location = tL_inputWebFileLocation2;
            String str2 = webDocument.url;
            webFile2.url = str2;
            tL_inputWebFileLocation2.url = str2;
            tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
            webFile2.size = tL_webDocumentNoProxy.size;
            webFile2.mime_type = tL_webDocumentNoProxy.mime_type;
            webFile2.attributes = tL_webDocumentNoProxy.attributes;
            webFile2.noproxy = true;
            return webFile2;
        } else {
            return null;
        }
    }

    public static WebFile createWithGeoPoint(double d, double d10, long j10, int i10, int i11, int i12, int i13) {
        WebFile webFile = new WebFile();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        webFile.location = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        webFile.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j10;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d10;
        webFile.f19646w = i10;
        tL_inputWebFileGeoPointLocation.f22466w = i10;
        webFile.h = i11;
        tL_inputWebFileGeoPointLocation.h = i11;
        webFile.zoom = i12;
        tL_inputWebFileGeoPointLocation.zoom = i12;
        webFile.scale = i13;
        tL_inputWebFileGeoPointLocation.scale = i13;
        webFile.mime_type = "image/png";
        webFile.url = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        webFile.attributes = new ArrayList<>();
        return webFile;
    }
}
