package org.telegram.messenger.chromecast;

import org.telegram.messenger.chromecast.ChromecastController;

public class ChromecastControllerState {
    private ChromecastController.RemoteMediaClientHandler client;
    private ChromecastMediaVariations media;
    private ChromecastFileServer server;

    private void addToFileServer(ChromecastMediaVariations chromecastMediaVariations) {
        if (this.server == null) {
            this.server = new ChromecastFileServer();
        }
        for (int i = 0; i < chromecastMediaVariations.getVariationsCount(); i++) {
            this.server.addFileToCast(chromecastMediaVariations.getVariation(i));
        }
    }

    private void removeFromFileServer(ChromecastMediaVariations chromecastMediaVariations) {
        if (this.server == null) {
            return;
        }
        for (int i = 0; i < chromecastMediaVariations.getVariationsCount(); i++) {
            this.server.removeFileFromCast(chromecastMediaVariations.getVariation(i));
        }
    }

    public ChromecastController.RemoteMediaClientHandler getClient() {
        return this.client;
    }

    public ChromecastMediaVariations getMedia() {
        return this.media;
    }

    public void setClient(ChromecastController.RemoteMediaClientHandler remoteMediaClientHandler) {
        ChromecastMediaVariations chromecastMediaVariations;
        ChromecastMediaVariations chromecastMediaVariations2 = this.media;
        if (chromecastMediaVariations2 != null && this.client == null && remoteMediaClientHandler != null) {
            addToFileServer(chromecastMediaVariations2);
        }
        if (this.client != null && (chromecastMediaVariations = this.media) != null && remoteMediaClientHandler == null) {
            removeFromFileServer(chromecastMediaVariations);
        }
        ChromecastController.RemoteMediaClientHandler remoteMediaClientHandler2 = this.client;
        if (remoteMediaClientHandler2 != null) {
            remoteMediaClientHandler2.unregister();
        }
        if (remoteMediaClientHandler != null) {
            remoteMediaClientHandler.register();
            ChromecastMediaVariations chromecastMediaVariations3 = this.media;
            if (chromecastMediaVariations3 != null) {
                remoteMediaClientHandler.load(chromecastMediaVariations3);
            }
        }
        this.client = remoteMediaClientHandler;
    }

    public void setMedia(ChromecastMediaVariations chromecastMediaVariations) {
        ChromecastMediaVariations chromecastMediaVariations2;
        if (this.client != null && chromecastMediaVariations != null) {
            addToFileServer(chromecastMediaVariations);
        }
        if (this.client != null && (chromecastMediaVariations2 = this.media) != null) {
            removeFromFileServer(chromecastMediaVariations2);
        }
        ChromecastController.RemoteMediaClientHandler remoteMediaClientHandler = this.client;
        if (remoteMediaClientHandler != null && chromecastMediaVariations != null) {
            remoteMediaClientHandler.load(chromecastMediaVariations);
        }
        this.media = chromecastMediaVariations;
    }
}
